package practice02;

import java.util.Scanner;

public class Stdio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("이름을 입력해주세요.");
        String name = scan.nextLine();

        System.out.println("\n나이를 입력해주세요.");
        int age = scan.nextInt();

        System.out.println("\n신장을 입력해주세요.");
        Double height = scan.nextDouble();

        System.out.printf("%s님 반갑습니다. 키는 %fcm에 나이는 %d이시네요.", name, height, age);

        scan.close();
    }
}
