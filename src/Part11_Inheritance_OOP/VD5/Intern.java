package src.Part11_Inheritance_OOP.VD5;
import java.util.Scanner;

public class Intern extends Student {
    private String company;
    private int internshipMonths;

    public Intern() {}

    public Intern(String name, int age, String studentId, double gpa, String company, int internshipMonths) {
        super(name, age, studentId, gpa);
        this.company = company;
        this.internshipMonths = internshipMonths;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên công ty thực tập: ");
        sc.nextLine();
        company = sc.nextLine();
        System.out.print("Nhập số tháng thực tập: ");
        internshipMonths = sc.nextInt();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Công ty thực tập: " + company);
        System.out.println("Số tháng thực tập: " + internshipMonths);
    }
}
