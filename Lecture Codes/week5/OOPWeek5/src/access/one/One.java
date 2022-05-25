package access.one;

public class One {
    private String privateField;
    protected String protectedField;
    String defaultField;
    public String publicField;

    public void accessTest() {
        privateField = "test";
        protectedField = "test";
        defaultField = "test";
        publicField = "test";
    }
}
