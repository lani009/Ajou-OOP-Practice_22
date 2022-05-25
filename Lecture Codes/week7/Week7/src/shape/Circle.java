package shape;

public class Circle extends Shape {
    private double radius;

    protected Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public String toString() {
        return String.format("Circle r=%f", radius);
    }
    
}
