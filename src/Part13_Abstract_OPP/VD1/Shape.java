package src.Part13_Abstract_OPP.VD1;

public abstract class Shape {
    private String color;

    public Shape() {}

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract float getArea();

    public abstract float getPerimeter();

    public abstract void input();

    public abstract String toString();
}
