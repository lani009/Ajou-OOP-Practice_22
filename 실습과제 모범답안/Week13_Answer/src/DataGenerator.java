import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DataGenerator {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("./YoutubeData.txt", Charset.forName("UTF-8")));

        List<String> videoNameList = new ArrayList<>();
        videoNameList.add("[토르: 러브 앤 썬더] 메인 예고편");
        videoNameList.add("두 찐따가 스튜어디스와 휴양지에 가면 생기는 일 - 괌");
        videoNameList.add("LE SSERAFIM, FEARLESS (르세라핌, FEARLESS) [THE SHOW 220524]");
        videoNameList.add("이 트러플 오일, 셰프님의 얼굴이 떠오르네요");
        videoNameList.add("[마녀 2] 메인 예고편");
        videoNameList.add("강다니엘(KANGDANIEL) - Upside Down M/V");
        videoNameList.add("[헝가리부부] 더니 어린이집 소풍날 김밥 싸갔는데 다른 학부형들이 다 드신날!!");
        videoNameList.add("[Be Mbitious/1회 선공개] 'Hey Mama' 안무 카피 미션 (홀리뱅 ver.) l 내일(5/24) 밤 10시 20분 첫.방.송");
        videoNameList.add("윤하 - 스물다섯, 스물하나 [불후의 명곡2 전설을 노래하다/Immortal Songs 2]");
        videoNameList.add("한 척에 2,500억! 비쌀 수 밖에 없는 기술집약 고부가가치 초대형 선박! 우리나라가 전세계 수주 싹쓸이 중!");
        videoNameList.add("＂보자＂ 3년 만에 연락 온 손석구;; 그럼 바로 나갈 줄 알고?ಠ_ಠ (준비 중)");
        videoNameList.add("성시경의 먹을텐데 l 맛 좋은 순대국");
        videoNameList.add("(요청폭발) 드디어 세자매 큐앤에이 공개");
        videoNameList.add("에헤이 먼저 타라니까");
        videoNameList.add("As It Was");
        videoNameList.add("구내염 고양이로서의 마지막 기록");
        videoNameList.add("손흥민이 '아시아 최초 득점왕'이 될 수 있었던 이유");
        videoNameList.add("월 매출 10억 '고든램지 버거' 비싼 이유");
        videoNameList.add("친구야 술 먹고 쳐들어와서 세숫대야에 냉면을 먹는게 사람이니...?");
        videoNameList.add("[우마 세계를 먹다!!!!] vol.1 베트남(ft.거제전갱이TV, 코코넛웜)");
        videoNameList.add("미국 공원에서 한국 삑삑이 신발을 신고 돌아다니면 일어나는 일 ㅋㅋ");
        videoNameList.add("일본여행♨️ 온천마을 쿠사츠 료칸에서 호캉스 | 유바타케 길거리 먹방");
        videoNameList.add("커딩 (커비 푸딩이라는 뜻)");
        videoNameList.add("24시간동안 흑백 VS 컬러!! 색깔이 없는 삶은 어떨까?!?!");
        videoNameList.add("유튜브 3일 차");
        videoNameList.add("[후토크] 이 선수의 국적은 대한민국입니다. 21-22시즌 PL 득점왕 손흥민!!");

        List<String> serverList = new ArrayList<>();
        serverList.add("Korea");
        serverList.add("Japan");
        serverList.add("Europe");
        serverList.add("NorthAmerica");

        SecureRandom rand = new SecureRandom();
        for (int i = 0; i < 1000000; i++) {
            bw.write(String.format("%03d # %12s # %s%n", rand.nextInt(100)+1, serverList.get(rand.nextInt(serverList.size())),
                    videoNameList.get(rand.nextInt(videoNameList.size()))));
        }
        bw.flush();
        bw.close();
    }
}
