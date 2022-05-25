package assignment;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class DataGenerator {
    public static void main(String[] args) throws IOException {
        List<String> dept = new ArrayList<>();
        dept.add("키움증권");
        dept.add("NH투자증권");
        dept.add("KB증권");
        dept.add("나무증권");
        dept.add("이베스트증권");

        List<String> stockList = new ArrayList<>();
        stockList.add("네오이뮨텍");
        stockList.add("피비파마");
        stockList.add("소마젠");
        stockList.add("미투젠");
        stockList.add("SNK");
        stockList.add("JTC");
        stockList.add("코오롱티슈진");
        stockList.add("잉글우드랩");
        stockList.add("엑세스바이오");
        stockList.add("SBI핀테크솔루션즈");
        stockList.add("윙입푸드");
        stockList.add("컬러레이");
        stockList.add("오가닉티코스메틱");
        stockList.add("GRT");
        stockList.add("골든센츄리");
        stockList.add("헝셩그룹");
        stockList.add("로스웰");
        stockList.add("크리스탈신소재");
        stockList.add("엘브이엠씨");

        Map<String, List<String>> map = new HashMap<>();

        for (String deptString : dept) {
            Collections.shuffle(stockList, new Random(System.currentTimeMillis()));
            map.put(deptString, stockList);
        }

        Random rand = new Random(System.currentTimeMillis());

        BufferedWriter bw1 = new BufferedWriter(new FileWriter("./week12_input_euckr.txt", Charset.forName("euc-kr")));
        BufferedWriter bw2 = new BufferedWriter(new FileWriter("./week12_input_utf8.txt", Charset.forName("utf-8")));
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            for (String stockName : entry.getValue()) {
                result.add(String.format("%s %s %d %d\n", entry.getKey(), stockName, rand.nextInt(10000) * 5, rand.nextInt(5000)));
            }
        }
        Collections.shuffle(result, new Random(System.currentTimeMillis()));
        for (String d : result) {
            bw1.write(d);
            bw2.write(d);
        }
        bw1.flush();
        bw1.close();
        bw2.flush();
        bw2.close();

    }
}
