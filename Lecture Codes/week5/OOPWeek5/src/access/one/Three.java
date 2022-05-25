package access.one;

public class Three {
    public void accessTest() {
        One o = new One();
        o.privateField = "test";
        o.protectedField = "test";
        o.defaultField = "test";
        o.publicField = "test";
    }
}
