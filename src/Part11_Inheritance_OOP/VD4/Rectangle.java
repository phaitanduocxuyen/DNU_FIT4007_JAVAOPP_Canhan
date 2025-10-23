package src.Part11_Inheritance_OOP.VD4;
import java.util.Scanner;

public class Rectangle {
    protected double width;
    protected double height;

    public Rectangle() {}

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều rộng: ");
        width = sc.nextDouble();
        System.out.print("Nhập chiều cao: ");
        height = sc.nextDouble();
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

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + "]";
    }
}
