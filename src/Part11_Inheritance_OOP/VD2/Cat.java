package src.Part11_Inheritance_OOP.VD2;
import java.util.Scanner;

public class Cat extends Animal {
    private String color;
    private String breed;

    public Cat() {}

    public Cat(String name, int age, String color, String breed) {
        super(name, age);
        this.color = color;
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean equalBreed(Cat c) {
        return this.breed.equalsIgnoreCase(c.breed);
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Màu lông: ");
        color = sc.nextLine();
        System.out.print("Giới tính: ");
        breed = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + ", Color: " + color + ", Breed: " + breed;
    }
}
