package src.Part13_Abstract_OPP.VD2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Sinh viên IT");
        System.out.println("2. Sinh viên BA");
        System.out.print("Chọn loại sinh viên: ");
        int choice = sc.nextInt();
        sc.nextLine(); // clear buffer

        Student student;
        if (choice == 1) {
            student = new StudentIT();
        } else {
            student = new StudentBA();
        }

        student.input();
        System.out.println("\nThông tin sinh viên:");
        System.out.println(student.toString());
    }
}
