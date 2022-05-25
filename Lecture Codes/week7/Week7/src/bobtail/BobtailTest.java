package bobtail;

public class BobtailTest {
    public static void main(String[] args) {
        Animal cat1 = new Cat();
        Animal cat2 = new KoreanBobtail();

        Cat cat3 = (Cat) cat1;
        Cat cat4 = (Cat) cat2;

        KoreanBobtail cat6 = (KoreanBobtail) cat2;


        // 불가능한 코드
        // KoreanBobtail cat7 = new Cat();

        System.out.println(cat1);
        System.out.println(cat2);
    }
}
