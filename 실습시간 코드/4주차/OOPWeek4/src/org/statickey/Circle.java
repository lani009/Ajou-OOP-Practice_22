package org.statickey;

public class Circle {
    private static final double PI = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * PI;
    }

    public static double getPI() {
        return PI;
    }

    public static void accessGetArea() {
        getPI();    // 정상적으로 작동
        getArea();  // 에러 발생 : Cannot make a static reference to the non-static method getArea() from the type Circle

        double a = radius;  // 에러 발생
        double b = PI;      // 정상적으로 작동
    }

    public void nonStaticAccess() {
        getPI();
        getArea();  // 둘 다 정상적으로 작동

        double a = radius;  // 에러 발생
        double b = PI;      // 정상적으로 작동
    }
}
