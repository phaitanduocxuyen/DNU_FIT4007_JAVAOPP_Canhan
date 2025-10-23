package src.Part12_Polymorphism_OOP.VD4;
import java.util.Scanner;

public class Student {
    protected String studentID;
    protected String name;
    protected int age;

    public Student() {}

    public Student(String studentID, String name, int age) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
    }

    public String getStudentID() { return studentID; }
    public void setStudentID(String studentID) { this.studentID = studentID; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        studentID = sc.nextLine();
        System.out.print("Nhập tên sinh viên: ");
        name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        age = sc.nextInt();
        sc.nextLine();
    }

    public boolean equals(Student s) {
        return this.studentID.equalsIgnoreCase(s.studentID);
    }

    public Student copyObject() {
        return new Student(studentID, name, age);
    }

    @Override
    public String toString() {
        return "StudentID: " + studentID + ", Name: " + name + ", Age: " + age;
    }
}
