public class StringTest {
    public static void main(String[] args) {
        String a = new String("Hello");
        String b = new String("Hello");

        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(b.equals(a));
    }
}
