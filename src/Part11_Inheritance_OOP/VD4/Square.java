package src.Part11_Inheritance_OOP.VD4;
import java.util.Scanner;

public class Square extends Rectangle {

    public Square() {}

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cạnh hình vuông: ");
        double side = sc.nextDouble();
        width = height = side;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        width = height = side;
    }

    @Override
    public String toString() {
        return "Square [side=" + width + "]";
    }
}
