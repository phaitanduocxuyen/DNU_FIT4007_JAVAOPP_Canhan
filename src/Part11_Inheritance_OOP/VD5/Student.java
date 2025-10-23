package src.Part11_Inheritance_OOP.VD5;
import java.util.Scanner;

public class Student extends Person {
    protected String studentId;
    protected double gpa;

    public Student() {}

    public Student(String name, int age, String studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        studentId = sc.nextLine();
        System.out.print("Nhập GPA: ");
        gpa = sc.nextDouble();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Mã SV: " + studentId);
        System.out.println("GPA: " + gpa);
    }
}
