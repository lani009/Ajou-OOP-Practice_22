package wrapper;

public class WrappingTest {
    public static void main(String[] args) {
        Integer a = 1;
        Double b = 2.0;

        Integer c = Integer.valueOf("1");

        int d = a;

        int max = Integer.max(d, a);
        Double.isFinite(Double.POSITIVE_INFINITY);
        Boolean.logicalAnd(false, true);


        Integer boxing = 5; // auto boxing
        int unboxing = boxing;  // auto unboxing
        Integer x = 1;
        int k = boxing + x;

        // Wrapper class에 new 연산자를 사용하는 것은 deprecated 되었기 때문에 권장하지 않음
        // 다만 실습 예제을 위해서 사용
        Integer x1 = new Integer(10);
        Integer x2 = new Integer(10);

        System.out.println(x1 == x2);
    }
}
