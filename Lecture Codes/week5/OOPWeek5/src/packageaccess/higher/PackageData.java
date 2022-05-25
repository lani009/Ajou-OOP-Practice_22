package packageaccess.higher;

public class PackageData {
    int number = 0;
    String string = "Hello";

    public String toString() {
        return String.format("number: %d; string: %s", number, string);
    }
}
