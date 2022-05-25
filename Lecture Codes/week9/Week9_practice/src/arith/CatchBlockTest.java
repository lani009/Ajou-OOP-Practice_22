package arith;

import java.util.Scanner;

public class CatchBlockTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = scan.nextLine();
        String b = scan.nextLine();

        int one = Integer.parseInt(a);
        int two = Integer.parseInt(b);

        System.out.println(one / two);

        scan.close();
    }
}
