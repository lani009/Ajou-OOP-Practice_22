package org.arrays;

import java.util.Arrays;
import java.util.Random;

public class BinarySearchTest {
    public static void main(String[] args) {
        Random rand = new Random(System.currentTimeMillis());
        int[] intArray = rand.ints(100).map(randNum -> randNum % 200 + 200).toArray();

        Arrays.sort(intArray);

        int index = 35;
        int indexElement = intArray[index];

        int foundIndex = Arrays.binarySearch(intArray, indexElement);

        System.out.println(index == foundIndex);
    }
}
