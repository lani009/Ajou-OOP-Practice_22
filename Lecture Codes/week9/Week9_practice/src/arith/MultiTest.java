package arith;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiTest {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 7};
        Scanner scan = null;

        try {
            // array[15] = 100;
            // scan.nextLine();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }


        try {
            // array[15] = 100;
            // scan.nextLine();
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public int getIntInput(Scanner scan) {
        try {
            int key = scan.nextInt();
            return key;
        } catch (InputMismatchException e) {
            System.out.println("정수를 입력해 주세요!");
        } finally {
            scan.close();
        }
        return 0;
    }
}
