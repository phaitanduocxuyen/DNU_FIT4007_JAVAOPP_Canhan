package src.Part12_Polymorphism_OOP.VD1;
import java.util.Scanner;

public class Menu {
    private StudentManager manager = new StudentManager();
    private Scanner sc = new Scanner(System.in);

    public int choiceMenu() {
        System.out.println("\n===== MENU QUẢN LÍ SINH VIÊN =====");
        System.out.println("1. Nhập thông tin sinh viên");
        System.out.println("2. Xem danh sách sinh viên");
        System.out.println("3. Tìm kiếm sinh viên theo ID");
        System.out.println("4. Xóa sinh viên theo ID");
        System.out.println("5. Cập nhật sinh viên");
        System.out.println("6. Sắp xếp sinh viên");
        System.out.println("7. Thoát");
        System.out.print("Chọn: ");
        return sc.nextInt();
    }

    public void run() {
        int choice;
        do {
            choice = choiceMenu();
            sc.nextLine();
            switch (choice) {
                case 1 -> addStudentMenu();
                case 2 -> manager.showStudents();
                case 3 -> {
                    System.out.print("Nhập ID: ");
                    String id = sc.nextLine();
                    Student s = manager.searchStudent(id);
                    System.out.println((s != null) ? s : "Không tìm thấy!");
                }
                case 4 -> {
                    System.out.print("Nhập ID cần xóa: ");
                    manager.deleteStudent(sc.nextLine());
                }
                case 5 -> {
                    System.out.print("Nhập ID cần cập nhật: ");
                    String id = sc.nextLine();
                    System.out.println("Chọn loại SV (1.IT / 2.BA): ");
                    int t = sc.nextInt(); sc.nextLine();
                    Student s = (t == 1) ? new StudentIT() : new StudentBA();
                    s.input();
                    manager.updateStudent(id, s);
                }
                case 6 -> sortMenu();
                case 7 -> System.out.println("Kết thúc chương trình.");
            }
        } while (choice != 7);
    }

    private void addStudentMenu() {
        System.out.println("1. Nhập sinh viên IT");
        System.out.println("2. Nhập sinh viên BA");
        System.out.print("Chọn: ");
        int opt = sc.nextInt(); sc.nextLine();
        Student s = (opt == 1) ? new StudentIT() : new StudentBA();
        s.input();
        manager.addStudent(s);
    }

    private void sortMenu() {
        System.out.println("1. Theo điểm trung bình");
        System.out.println("2. Theo tuổi");
        System.out.println("3. Theo mã sinh viên");
        System.out.println("4. Theo ngành học");
        System.out.print("Chọn: ");
        int opt = sc.nextInt();
        switch (opt) {
            case 1 -> manager.sortByScore();
            case 2 -> manager.sortByAge();
            case 3 -> manager.sortByID();
            case 4 -> manager.sortByType();
        }
    }

    public static void main(String[] args) {
        new Menu().run();
    }
}
