package access.two;

import access.one.One;

public class Two {
    public void accessTest() {
        One o = new One();
        o.privateField = "test";
        o.protectedField = "test";
        o.defaultField = "test";
        o.publicField = "test";
    }
}
