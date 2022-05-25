public class Person {
    String name;    // 이름
    int age;    // 나이
    int height; // 키

    public void selfIntroduce() {
        System.out.printf("안녕하세요! 저는 %s입니다. 나이는 %d이고 키는 %d입니다.\n", name, age, height);
    }
}
