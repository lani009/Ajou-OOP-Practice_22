package wildcard;

import java.util.ArrayList;
import java.util.List;

public class WildcardTest {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(i);
        }

        List<Double> list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list2.add(i * 2.1);
        }

        System.out.println(getAverage(list1));
        System.out.println(getAverage(list2));

    }

    // public static double getAverage(List<Integer> list) {
    //     return list.stream().mapToInt(e -> e).average().getAsDouble();
    // }

    public static double getAverage(List<? extends Number> list) {
        return list.stream().mapToDouble(e -> e.doubleValue()).average().getAsDouble();
    }

    // public static double getAverage(List<Double> list) {
    // return list.stream().mapToDouble(e -> e).average().getAsDouble();
    // }
}
