package org.statickey;

public class CircleTest {
    public static void main(String[] args) {
        Circle.getArea();   // 에러발생: Cannot make a static reference to the non-static method getArea() from the type Circle

        Circle circle1 = new Circle(2);
        circle1.getArea();  // getArea() 메소드는 non-static 메소드이기 때문에 인스턴스를 먼저 생성한뒤, 객체를 통해 호출할 수 있다.

        Circle.getPI();     // getPI() 메소드는 static 메소드이기 때문에 클래스를 통해 호출할 수 있다.
    }
}
