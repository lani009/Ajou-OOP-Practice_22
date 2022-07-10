package genericMethods;

public class GenericMethodTest {
    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        System.out.println(gm.<Integer>getMiddle(2, 3, 45, 2, 1, 234, 43, 5, 2));
    }
}

class GenericMethod {
    public <T> T getMiddle(T... a) {
        return a[a.length / 2];
    }
}
