package src.Part8_Constructor_OOP;

public class VD3_Circle {
    private double radius;

    public VD3_Circle() {
    }

    public VD3_Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "VD3_Circle{" +
                "radius=" + radius +
                '}';
    }
}
