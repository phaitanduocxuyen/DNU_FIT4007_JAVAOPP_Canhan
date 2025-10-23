package src.Part11_Inheritance_OOP.VD5;
import java.util.Scanner;

public class Person {
    protected String name;
    protected int age;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        age = sc.nextInt();
        sc.nextLine();
    }

    public void display() {
        System.out.println("Họ tên: " + name);
        System.out.println("Tuổi: " + age);
    }
}
