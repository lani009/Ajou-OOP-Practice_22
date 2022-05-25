package arith;

public class TryCatchTest {
    public static void main(String[] args) {
        try {
            Integer.parseInt("190");
            Integer.parseInt("-55");
            Integer.parseInt(new String("Hello"));
            Integer.parseInt(new String("50"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
