package collections.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ForEachTest {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                list.add(new Student(i*2));
            } else {
                list.add(new Student(i));
            }
        }

        list.forEach(s -> System.out.println(s.getAge()));

        list.sort((o1, o2) -> {
            if (o1.getAge() > o2.getAge()) {
                return 1;
            } else if (o1.getAge() == o2.getAge()) {
                return 0;
            } else {
                return -1;
            }
        });

        list.forEach(s -> System.out.println(s.getAge()));
    }
}
