package data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 각 지역에 위치한 유튜브 서버와 통신하기 위한 클래스
 */
public class ServerConnection {
    private Map<ServerType, RequestProvider> taskMap = new EnumMap<>(ServerType.class);
    private Set<String> videoNameSet = new HashSet<>();

    /**
     * 본인이 직접 구현한 ConcurrentRequestProvider 클래스의 Class 객체를 매개변수로 넣어주세요.
     * 
     * <pre>
     * ServerConnection conn = new ServerConnection(ConcurrentRequestProvider.class);
     * </pre>
     * ConcurrentRequestProvider는 {@link #RequestProvider} 를 구현해야 합니다.
     * @param provider ConcurrentRequestProvider의 Class 객체
     */
    public ServerConnection(Class<? extends RequestProvider> provider) {
        for (ServerType sType : ServerType.values()) {
            try {
                taskMap.put(sType, provider.getConstructor().newInstance());
            } catch (InstantiationException | IllegalAccessException | IllegalArgumentException
                    | InvocationTargetException | NoSuchMethodException | SecurityException e) {
                throw new RuntimeException("provider 클래스가 과제 지시사항에 맞지 않아서 발생하는 문제입니다.\n" +
                        "과제 지시사항과 일치하는데도 문제가 계속해서 발생한다면, " +
                        "Exception 메시지와 함께 조교에게 문의하세요.", e);
            }
        }
        try (BufferedReader br = new BufferedReader(new FileReader("./YoutubeData.txt", Charset.forName("UTF-8")))) {
            String line;
            while ((line = br.readLine()) != null) {
                var obj = line.split("#");
                videoNameSet.add(obj[2].trim());
                taskMap.get(ServerType.valueOfTextName(obj[1].trim()))
                        .offer(new ViewUpdateRequest(obj[2].trim(), Integer.parseInt(obj[0].trim())));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("YoutubeData.txt 파일을 이클립스 프로젝트 폴더 내에 위치시켜주세요." +
                    "11주차 실습시간에 배운 내용을 참조시면 됩니다.", e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 주어진 {@link ServerType}에 따라 해당 서버가 요청한 조회수 업데이트 request 데이터를 받아온다.
     * 만약 더이상 받아올 request 데이터가 없다면 {@code null} 을 반환한다.
     * 
     * <pre>
     * conn.getDataRequest(ServerType.KOREA);
     * </pre>
     * 위 코드는 KOREA 서버의 Request를 받아오는 명령이다.
     * 
     * @param serverType 받아올 요청의 서버 타입 {@link ServerType}
     *
     * @return 해당 서버가 요청한 소회수 업데이트 request 데이터, 만약 더이상 request가 없다면 {@code null} 을 반환
     */
    public ViewUpdateRequest getDataRequest(ServerType serverType) {
        return taskMap.get(serverType).poll();
    }

    /**
     * 서버에 업로드 되어 있는 모든 영상의 제목을 {@code Set<String>} 타입으로 반환한다.
     * @return 서버에 업로드 되어 있는 모든 영상의 제목 집합
     */
    public Set<String> getExistVideoNames() {
        return videoNameSet;
    }
}
