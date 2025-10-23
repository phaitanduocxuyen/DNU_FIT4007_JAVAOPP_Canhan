package src.Part9_Method_OOP;;

public class VD5_Square {
    private double side;

    public VD5_Square() {}

    public VD5_Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public boolean isIntegerSquareSide() {
        return side == (int) side;
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + side + '}';
    }
}
