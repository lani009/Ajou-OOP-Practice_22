package org.overloading;

public class OverloadingTest {
    public static void main(String[] args) {
        print(1);
        print(1, 4);
        print(5.4, 7);
    }

    public static void print(int a) {
        System.out.printf("%d\n", a);
    }

    public static void print(int a, int b) {
        System.out.printf("%d %d\n", a, b);
    }

    public static void print(double a, int b) {
        System.out.printf("%f %d\n", a, b);
    }

    public static String getData(int a) {
        return String.format("%d", a);
    }

    public static int getData(int a, int b) {
        return a + b;
    }
}
