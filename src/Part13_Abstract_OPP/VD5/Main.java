package src.Part13_Abstract_OPP.VD5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);
        String file = "students.txt";

        // Đọc dữ liệu cũ (nếu có)
        manager.loadFromFile(file);

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
            System.out.println("10. Lưu danh sách ra file");
            System.out.println("11. Đọc danh sách từ file");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Mã: ");
                    String masv = sc.nextLine();
                    System.out.print("Tên: ");
                    String name = sc.nextLine();
                    System.out.print("Tuổi: ");
                    int age = sc.nextInt();
                    System.out.print("Điểm Java: ");
                    double java = sc.nextDouble();
                    System.out.print("Điểm HTML: ");
                    double html = sc.nextDouble();
                    manager.addStudent(new StudentIT(masv, name, age, java, html));
                }
                case 2 -> {
                    System.out.print("Mã: ");
                    String masv = sc.nextLine();
                    System.out.print("Tên: ");
                    String name = sc.nextLine();
                    System.out.print("Tuổi: ");
                    int age = sc.nextInt();
                    System.out.print("Điểm Marketing: ");
                    double mkt = sc.nextDouble();
                    System.out.print("Điểm Sales: ");
                    double sales = sc.nextDouble();
                    manager.addStudent(new StudentBA(masv, name, age, mkt, sales));
                }
                case 3 -> manager.displayAllStudents();
                case 4 -> {
                    System.out.print("Nhập mã: ");
                    String id = sc.nextLine();
                    Student s = manager.findStudent(id);
                    System.out.println(s != null ? s : " Không tìm thấy!");
                }
                case 5 -> {
                    System.out.print("Nhập tuổi: ");
                    int age = sc.nextInt();
                    ArrayList<Student> list = manager.findStudent(age);
                    list.forEach(System.out::println);
                }
                case 6 -> {
                    System.out.print("Nhập mã cần sửa: ");
                    String id = sc.nextLine();
                    System.out.print("Tên mới: ");
                    String name = sc.nextLine();
                    System.out.print("Tuổi mới: ");
                    int age = sc.nextInt();
                    System.out.print("Điểm Java mới: ");
                    double java = sc.nextDouble();
                    System.out.print("Điểm HTML mới: ");
                    double html = sc.nextDouble();
                    manager.editStudent(id, new StudentIT(id, name, age, java, html));
                }
                case 7 -> {
                    System.out.print("Nhập mã cần xóa: ");
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
                case 10 -> manager.saveToFile(file);
                case 11 -> manager.loadFromFile(file);
                case 0 -> {
                    System.out.println("Tạm biệt!");
                    return;
                }
                default -> System.out.println(" Lựa chọn không hợp lệ!");
            }
        }
    }
}

