package collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> studentMap = new HashMap<>();

        studentMap.put("201921166", "정의철");
        studentMap.put("202213546", "김땡땡");
        studentMap.put("201851354", "박땡땡");

        System.out.println(studentMap.get("202213546"));
    }
}
