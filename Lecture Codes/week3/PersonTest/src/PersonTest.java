public class PersonTest {
    public static void main(String[] args) {
        Person a = new Person();
        Person b = new Person();
        Person c = a;

        a.age = 21;
        b.age = 22;
        c.age = 23;

        System.out.println("a: age is " + a.age);
        System.out.println("b: age is " + b.age);
        System.out.println("c: age is " + c.age);
    }
}
