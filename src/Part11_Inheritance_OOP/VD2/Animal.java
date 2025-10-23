package src.Part11_Inheritance_OOP.VD2;
import java.util.Scanner;
import java.time.Year;

public class Animal {
    protected String name;
    protected int age;

    public Animal() {}

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tên động vật: ");
        name = sc.nextLine();
        System.out.print("Tuổi: ");
        age = sc.nextInt();
    }

    public int getYearOfBirth() {
        return Year.now().getValue() - age;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
