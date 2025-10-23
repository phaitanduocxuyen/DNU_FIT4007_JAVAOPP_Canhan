package src.Part11_Inheritance_OOP.VD4;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Nhập hình chữ nhật ===");
        Rectangle r = new Rectangle();
        r.input();
        System.out.println("Thông tin hình chữ nhật: " + r);
        System.out.println("Diện tích: " + r.getArea());
        System.out.println("Chu vi: " + r.getPerimeter());

        System.out.println("\n=== Nhập hình vuông ===");
        Square s = new Square();
        s.input();
        System.out.println("Thông tin hình vuông: " + s);
        System.out.println("Diện tích: " + s.getArea());
        System.out.println("Chu vi: " + s.getPerimeter());
    }
}
