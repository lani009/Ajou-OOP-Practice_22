package shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape a = new Circle("Red", 5.0);

        // System.out.println(a.getClass() == Circle.class);

        System.out.println(a instanceof Rectangle);
        if (a instanceof Circle) {
        }
    }
}
