package src.Part13_Abstract_OPP.VD1;

import java.util.Scanner;

public class Rectangle extends Shape {
    private float width;
    private float height;

    public Rectangle() {}

    public Rectangle(String color, float width, float height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập màu sắc: ");
        setColor(sc.nextLine());
        System.out.print("Nhập chiều rộng: ");
        width = sc.nextFloat();
        System.out.print("Nhập chiều dài: ");
        height = sc.nextFloat();
    }

    @Override
    public float getArea() {
        return width * height;
    }

    @Override
    public float getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle [color=" + getColor() + ", width=" + width + ", height=" + height +
                ", perimeter=" + getPerimeter() + ", area=" + getArea() + "]";
    }
}
