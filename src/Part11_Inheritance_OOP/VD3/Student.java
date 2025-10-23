package src.Part11_Inheritance_OOP.VD3;
import java.util.Scanner;

public class Student extends Person {
    private String studentId;
    private String nameSchool;

    public Student() {}

    public Student(String name, int age, String address, String studentId, String nameSchool) {
        super(name, age, address);
        this.studentId = studentId;
        this.nameSchool = nameSchool;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getNameSchool() {
        return nameSchool;
    }

    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        studentId = sc.nextLine();
        System.out.print("Nhập tên trường: ");
        nameSchool = sc.nextLine();
    }

    public boolean checkStudentId() {
        return studentId.startsWith("23IT");
    }

    @Override
    public String toString() {
        return super.toString() + ", StudentId: " + studentId + ", School: " + nameSchool;
    }
}
