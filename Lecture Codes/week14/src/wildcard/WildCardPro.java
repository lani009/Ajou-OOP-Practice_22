package wildcard;

import java.util.List;

public class WildCardPro {
    public static void main(String[] args) {

    }

    public static void sayName(List<? extends Person> list) {
        list.forEach(e -> System.out.println(e.getName()));
    }

    public static void sayDepartment(List<? extends Student> list) {
        list.forEach(e -> System.out.println(e.getDepartment()));
    }

    public static void sayToString(List<?> list) {
        list.forEach(e -> System.out.println(e));
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class Student extends Person {
    private String department;

    public Student(String name, String department) {
        super(name);
        this.department = department;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

class GradStudent extends Student {
    private String lab;

    public GradStudent(String name, String department, String lab) {
        super(name, department);
        this.lab = lab;
    }

    public String getLab() {
        return this.lab;
    }

    public void setYear(String lab) {
        this.lab = lab;
    }
}
