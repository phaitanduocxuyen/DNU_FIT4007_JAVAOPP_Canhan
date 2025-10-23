package src.Part11_Inheritance_OOP.VD3;
import java.util.Scanner;
import java.time.Year;

public class Person {
    protected String name;
    protected int age;
    protected String address;

    public Person() {}

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        address = sc.nextLine();
    }

    public int getYearOfBirth() {
        return Year.now().getValue() - age;
    }

    public String getUpperName() {
        return name.toUpperCase();
    }

    public boolean checkAge(int n) {
        return age >= n;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Address: " + address;
    }
}
