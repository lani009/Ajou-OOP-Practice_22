//import java.util.ArrayList;

public class Foo {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list1.add(Integer.toString(i));
        }

        for (int i = 0; i < 10; i++) {
            list2.add(Integer.toString(i));
        }

        list1.addAll(list2);

        list1.forEach(System.out::println);
    }
}
