package src.Part11_Inheritance_OOP.VD5;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Nhập thông tin thực tập sinh ===");
        Intern intern = new Intern();
        intern.input();

        System.out.println("\n=== Thông tin thực tập sinh ===");
        intern.display();
    }
}
