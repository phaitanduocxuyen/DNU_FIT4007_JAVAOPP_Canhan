package src.Part13_Abstract_OPP.VD1;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Nhập hình tam giác ===");
        Triangle triangle = new Triangle();
        triangle.input();
        System.out.println(triangle);

        System.out.println("\n=== Nhập hình chữ nhật ===");
        Rectangle rectangle = new Rectangle();
        rectangle.input();
        System.out.println(rectangle);
    }
}
