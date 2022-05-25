package protectedMember.a;

public class B extends A {
    public void accessTest() {
        super.publicField = "test";
        super.protectedField = "test";
        super.defaultField = "test";
        super.privateField = "test";
    }
}
