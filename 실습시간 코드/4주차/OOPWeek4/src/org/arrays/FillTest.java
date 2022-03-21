package org.arrays;

import java.util.Arrays;

public class FillTest {
    public static void main(String[] args) {
        int[] intArray = { 5, 3, 4, 8, 7, 9, 2 };

        for (int element : intArray) {
            System.out.printf("%s ", element);
        }
        System.out.println("\n");

        Arrays.fill(intArray, 50);

        for (int element : intArray) {
            System.out.printf("%s ", element);
        }
    }
}
