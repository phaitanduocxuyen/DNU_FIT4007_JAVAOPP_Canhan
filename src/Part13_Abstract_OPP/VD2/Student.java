package src.Part13_Abstract_OPP.VD2;

import java.util.Scanner;
public abstract class Student {
    private String masv;
    private String name;
    private int age;

    public Student() {}

    public Student(String masv, String name, int age) {
        this.masv = masv;
        this.name = name;
        this.age = age;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
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
        System.out.print("Nhập mã sinh viên: ");
        masv = sc.nextLine();
        System.out.print("Nhập tên sinh viên: ");
        name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        age = sc.nextInt();
    }

    public abstract float calculateAverage();

    public abstract String toString();
}
