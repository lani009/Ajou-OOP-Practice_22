import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {

        // List<type> name = new ArrayList<>(); 방식으로 생성한다.
        List<String> strList = new ArrayList<>();

        strList.add("HI");
        strList.add("Hello");
        strList.add("Whatup");

        System.out.println(strList.size()); // get size(length) of list
        System.out.println(strList.isEmpty()); // same of 'strList.size() == 0'
        System.out.println(strList.get(2)); // 2번째 element를 리스트에서 읽어옴


        // foreach 문으로도 활용가능
        for (String value : strList) {
            System.out.println(value);
        }

        strList.remove(2); // 2번째 element를 리스트에서 삭제
        strList.remove("HI");   // HI라는 값을 가진 element를 리스트에서 삭제
    }
}
