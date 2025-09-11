import java.util.Scanner;

public class Vd8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên của bạn: ");
        String ten = scanner.nextLine(); // Dùng nextLine() để nhập cả câu có khoảng trắng

        int doDai = ten.length(); // Sử dụng phương thức .length()

        System.out.println("Độ dài tên của bạn là: " + doDai);

        scanner.close();
    }
}