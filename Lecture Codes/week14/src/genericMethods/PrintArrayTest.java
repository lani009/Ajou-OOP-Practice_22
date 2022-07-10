package genericMethods;

public class PrintArrayTest {
    public static void main(String[] args) {
        printArray(new String[] { "a", "b", "c", "d", "e" });
        printArray(new int[] { 2, 3, 5, 5, 2, 1 });
        printArray(new boolean[] { true, false, false, true });
        printArray(new double[] { 5.1, 35.1, 138.8, 385., 35.41 });
    }

    public static void printArray(int[] array) {
        for (int e : array) {
            System.out.printf("%d ", e);
        }
        System.out.println();
    }

    public static void printArray(String[] array) {
        for (String e : array) {
            System.out.printf("%s ", e);
        }
        System.out.println();
    }

    public static void printArray(boolean[] array) {
        for (boolean e : array) {
            System.out.printf("%b ", e);
        }
        System.out.println();
    }

    public static void printArray(double[] array) {
        for (double e : array) {
            System.out.printf("%f ", e);
        }
        System.out.println();
    }
}
