package constructor;

public class Student {
    private String id;
    private String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(int id, String name) {
        this(Integer.toString(id), name);
        // 또는
        this.id = Integer.toString(id);
        this.name = name;
    }
}
