package src.Part13_Abstract_OPP.VD4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU QUẢN LÝ SINH VIÊN =====");
            System.out.println("1. Thêm sinh viên IT");
            System.out.println("2. Thêm sinh viên BA");
            System.out.println("3. Hiển thị danh sách");
            System.out.println("4. Tìm sinh viên theo mã");
            System.out.println("5. Tìm sinh viên theo tuổi");
            System.out.println("6. Sửa thông tin sinh viên");
            System.out.println("7. Xóa sinh viên");
            System.out.println("8. Sắp xếp theo điểm trung bình");
            System.out.println("9. Sắp xếp theo tuổi");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Nhập mã: ");
                    String masv = sc.nextLine();
                    System.out.print("Nhập tên: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập tuổi: ");
                    int age = sc.nextInt();
                    System.out.print("Nhập điểm Java: ");
                    double java = sc.nextDouble();
                    System.out.print("Nhập điểm HTML: ");
                    double html = sc.nextDouble();
                    manager.addStudent(new StudentIT(masv, name, age, java, html));
                }

                case 2 -> {
                    System.out.print("Nhập mã: ");
                    String masv = sc.nextLine();
                    System.out.print("Nhập tên: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập tuổi: ");
                    int age = sc.nextInt();
                    System.out.print("Nhập điểm Marketing: ");
                    double mkt = sc.nextDouble();
                    System.out.print("Nhập điểm Sales: ");
                    double sales = sc.nextDouble();
                    manager.addStudent(new StudentBA(masv, name, age, mkt, sales));
                }

                case 3 -> manager.displayAllStudents();

                case 4 -> {
                    System.out.print("Nhập mã sinh viên: ");
                    String id = sc.nextLine();
                    Student s = manager.findStudent(id);
                    if (s != null) System.out.println(s);
                    else System.out.println(" Không tìm thấy sinh viên!");
                }

                case 5 -> {
                    System.out.print("Nhập tuổi cần tìm: ");
                    int age = sc.nextInt();
                    ArrayList<Student> list = manager.findStudent(age);
                    if (list.isEmpty()) System.out.println(" Không có sinh viên nào!");
                    else list.forEach(System.out::println);
                }

                case 6 -> {
                    System.out.print("Nhập mã sinh viên cần sửa: ");
                    String id = sc.nextLine();
                    System.out.print("Nhập tên mới: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập tuổi mới: ");
                    int age = sc.nextInt();
                    System.out.print("Nhập điểm trung bình mới (IT - Java, HTML): ");
                    double java = sc.nextDouble();
                    double html = sc.nextDouble();
                    manager.editStudent(id, new StudentIT(id, name, age, java, html));
                }

                case 7 -> {
                    System.out.print("Nhập mã sinh viên cần xóa: ");
                    String id = sc.nextLine();
                    manager.removeStudent(id);
                }

                case 8 -> {
                    manager.sortByScore();
                    manager.displayAllStudents();
                }

                case 9 -> {
                    manager.sortByAge();
                    manager.displayAllStudents();
                }

                case 0 -> {
                    System.out.println("Tạm biệt!");
                    return;
                }

                default -> System.out.println(" Lựa chọn không hợp lệ!");
            }
        }
    }
}

