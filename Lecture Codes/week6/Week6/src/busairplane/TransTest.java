package busairplane;

public class TransTest {
    public static void main(String[] args) {
        Person p1 = new Person("kim", 18);
        Person p2 = new Person("jung", 20);
        Person p3 = new Person("yun", 23);

        Transportation airplane = new Airplane();
        Transportation bus = new Bus();

        airplane.ride(p3);
        bus.ride(p2);
    }
}
