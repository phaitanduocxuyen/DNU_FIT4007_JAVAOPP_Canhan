package src.Part9_Method_OOP;;

public class VD4_Triangle {
    private double sideA, sideB, sideC;

    public VD4_Triangle() {}

    public VD4_Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public void set(double a, double b, double c) {
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
    }

    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    public boolean isIsoscelesTriangle() {
        return sideA == sideB || sideA == sideC || sideB == sideC;
    }

    public boolean isEquilateralTriangle() {
        return sideA == sideB && sideB == sideC;
    }

    public boolean isRightTriangle() {
        double[] s = {sideA, sideB, sideC};
        java.util.Arrays.sort(s);
        return Math.abs(s[0]*s[0] + s[1]*s[1] - s[2]*s[2]) < 1e-6;
    }

    @Override
    public String toString() {
        return "Triangle{" + "sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + '}';
    }
}
