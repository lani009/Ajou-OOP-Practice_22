package practice02;

import java.util.Scanner;

public class SortInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("몇개의 수를 입력하시겠습니까?");

        int num = scan.nextInt();

        int[] array = new int[num];

        System.out.println("차례차례 수를 입력해주세요.");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        int temp;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        for (int val : array) {
            System.out.printf("%d ", val);
        }
    }
}
