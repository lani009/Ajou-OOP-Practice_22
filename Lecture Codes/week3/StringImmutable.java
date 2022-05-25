public class StringImmutable {
    public static void main(String[] args) {
        String a = "HI";
        System.out.println(a.hashCode());
        a += "Hello";
        System.out.println(a.hashCode());
        a += "Whatup";
        System.out.println(a.hashCode());
    }
}
