package src.Part11_Inheritance_OOP.VD2;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        System.out.println("Nhập thông tin mèo 1:");
        cat1.input();
        System.out.println("Nhập thông tin mèo 2:");
        cat2.input();

        System.out.println("\nThông tin mèo 1:");
        System.out.println(cat1);
        System.out.println("Thông tin mèo 2:");
        System.out.println(cat2);

        System.out.println("Năm sinh mèo 2: " + cat2.getYearOfBirth());
        System.out.println("Hai mèo cùng giới tính: " + cat1.equalBreed(cat2));
    }
}
