package hw12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StockParser {
    public static void main(String[] args) {
        Map<String, List<Stock>> stockMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader("./week12_input_utf8.txt", Charset.forName("UTF-8")))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] stockInfo = line.split(" ");

                String broker = stockInfo[0]; // 증권사
                String stockName = stockInfo[1]; // 종목 이름
                int price = Integer.parseInt(stockInfo[2]); // 구매가격
                int amt = Integer.parseInt(stockInfo[3]); // 개수

                stockMap.putIfAbsent(broker, new ArrayList<>());
                stockMap.get(broker).add(new Stock(stockName, price, amt));
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        System.out.println("=== 증권사 목록 ===");
        for (String broker : stockMap.keySet()) {
            System.out.println(broker);
        }
        System.out.println();

        System.out.println("=== 종목 이름 목록 ===");
        Set<String> stockNameSet = new HashSet<>();
        for (Map.Entry<String, List<Stock>> entry : stockMap.entrySet()) {
            for (Stock stock : entry.getValue()) {
                stockNameSet.add(stock.getName());
            }
        }
        for (String stockName : stockNameSet) {
            System.out.println(stockName);
        }
        System.out.println();

        System.out.println("=== 증권사 별 종목 구매 현황 ===");
        for (Map.Entry<String, List<Stock>> entry : stockMap.entrySet()) {
            System.out.printf("== %s ==\n", entry.getKey());
            List<Stock> stockList = entry.getValue();
            stockList.sort((e1, e2) -> {
                int sum1 = e1.getAmt() * e1.getPrice();
                int sum2 = e2.getAmt() * e2.getPrice();

                if (sum1 < sum2) {
                    return -1;
                } else if (sum1 == sum2) {
                    return 0;
                } else {
                    return 1;
                }
            });
            for (Stock stock : stockList) {
                System.out.printf("%s %d원\n", stock.getName(), stock.getAmt() * stock.getPrice());
            }
            System.out.println();
        }
    }
}
