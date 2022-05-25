package org.arrays;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        int[] intArray = { 5, 1, 9, 7, 0, 3, 5, 4, 3, 8 };

        for (int element : intArray) {
            System.out.printf("%d ", element);            
        }

        System.out.println("\n");

        Arrays.sort(intArray);

        for (int element : intArray) {
            System.out.printf("%d ", element);
        }
    }
}
