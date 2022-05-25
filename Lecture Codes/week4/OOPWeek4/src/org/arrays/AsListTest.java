package org.arrays;

import java.util.Arrays;
import java.util.List;

public class AsListTest {
    public static void main(String[] args) {
        String[] strArray = { "HI", "Hello", "World", "Whatup", "GoodDay", "NiceDay" };

        List<String> strList = Arrays.asList(strArray);

        for (String str : strList) {
            System.out.println(str);
        }
    }
}
