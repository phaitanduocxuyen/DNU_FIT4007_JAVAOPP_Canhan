package src.Part12_Polymorphism_OOP.VD5;
import java.util.*;

public class Menu {
    private StudentManager manager = new StudentManager();
    private Scanner sc = new Scanner(System.in);

    public int choiceMenu() {
        System.out.println("\n=== MENU QUẢN LÝ SINH VIÊN ===");
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
            sc.nextLine(); // clear buffer
            switch (choice) {
                case 1 -> menuAdd();
                case 2 -> manager.showStudents();
                case 3 -> menuSearch();
                case 4 -> menuDelete();
                case 5 -> menuUpdate();
                case 6 -> menuSort();
                case 7 -> System.out.println("Thoát chương trình.");
                default -> System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 7);
    }

    private void menuAdd() {
        System.out.println("1. Nhập sinh viên IT");
        System.out.println("2. Nhập sinh viên BA");
        System.out.print("Chọn: ");
        int t = sc.nextInt();
        sc.nextLine();
        Student s = (t == 1) ? new StudentIT() : new StudentBA();
        s.input();
        manager.addStudent(s);
    }

    private void menuSearch() {
        System.out.print("Nhập ID cần tìm: ");
        String id = sc.nextLine();
        Student s = manager.searchStudent(id);
        System.out.println((s != null) ? s : "Không tìm thấy.");
    }

    private void menuDelete() {
        System.out.print("Nhập ID cần xóa: ");
        String id = sc.nextLine();
        manager.deleteStudent(id);
    }

    private void menuUpdate() {
        System.out.print("Nhập ID cần cập nhật: ");
        String id = sc.nextLine();
        Student old = manager.searchStudent(id);
        if (old == null) {
            System.out.println("Không tìm thấy!");
            return;
        }
        System.out.println("Cập nhật lại thông tin:");
        Student s = (old instanceof StudentIT) ? new StudentIT() : new StudentBA();
        s.input();
        manager.updateStudent(id, s);
    }

    private void menuSort() {
        System.out.println("1. Theo điểm trung bình");
        System.out.println("2. Theo tuổi");
        System.out.println("3. Theo mã sinh viên");
        System.out.println("4. Theo ngành học");
        System.out.print("Chọn: ");
        int t = sc.nextInt();
        switch (t) {
            case 1 -> manager.sortByScore();
            case 2 -> manager.sortByAge();
            case 3 -> manager.sortByID();
            case 4 -> manager.sortByType();
        }
        manager.showStudents();
    }
}
