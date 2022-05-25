package shape;

public abstract class Shape {
    private String color;

    protected Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public String getColor() {
        return color;
    }

    @Override
    public abstract String toString();
}
