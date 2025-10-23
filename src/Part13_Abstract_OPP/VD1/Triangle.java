package src.Part13_Abstract_OPP.VD1;
import java.util.Scanner;

public class Triangle extends Shape {
    private float sideA;
    private float sideB;
    private float sideC;

    public Triangle() {}

    public Triangle(String color, float sideA, float sideB, float sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public float getSideA() {
        return sideA;
    }

    public void setSideA(float sideA) {
        this.sideA = sideA;
    }

    public float getSideB() {
        return sideB;
    }

    public void setSideB(float sideB) {
        this.sideB = sideB;
    }

    public float getSideC() {
        return sideC;
    }

    public void setSideC(float sideC) {
        this.sideC = sideC;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập màu sắc: ");
        setColor(sc.nextLine());
        System.out.print("Nhập cạnh A: ");
        sideA = sc.nextFloat();
        System.out.print("Nhập cạnh B: ");
        sideB = sc.nextFloat();
        System.out.print("Nhập cạnh C: ");
        sideC = sc.nextFloat();
    }

    @Override
    public float getArea() {
        float p = getPerimeter() / 2;
        return (float) Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public float getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String toString() {
        return "Triangle [color=" + getColor() + ", sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC +
                ", perimeter=" + getPerimeter() + ", area=" + getArea() + "]";
    }
}
