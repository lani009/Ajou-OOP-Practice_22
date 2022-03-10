import java.util.Scanner;

public class SelfIntroduce {
    public static void main(String[] args) {
        String name;    // 이름
        Scanner scan = new Scanner(System.in);

        name = scan.next();

        System.out.printf("안녕하세요 저는 %s 입니다.", name);
        scan.close();
    }
}
