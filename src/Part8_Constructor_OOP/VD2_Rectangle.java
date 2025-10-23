package src.Part8_Constructor_OOP;

public class VD2_Rectangle {
    private double width;
    private double height;

    public VD2_Rectangle() {
    }

    public VD2_Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "VD2_Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
