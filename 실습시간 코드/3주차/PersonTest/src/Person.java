public class Person {
    String name;
    int age;
    int height;

    public void selfIntroduce() {
        System.out.printf("안녕하세요! 저는 %s입니다. 나이는 %d이고 키는 %dcm입니다.", name, age, height);
    }
}
