package src.Part8_Constructor;

public class VD5_Square {
    private double side;

    public VD5_Square() {
    }

    public VD5_Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "VD5_Square{" +
                "side=" + side +
                '}';
    }
}
