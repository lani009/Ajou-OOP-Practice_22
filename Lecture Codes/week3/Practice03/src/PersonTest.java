public class PersonTest {
    public static void main(String[] args) {
        Person a = new Person();
        Person b = new Person();
        Person c = a;

        b.setHeight(180);

        System.out.println(b.getHeight());
    }
}
