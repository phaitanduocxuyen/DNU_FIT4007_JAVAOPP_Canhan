package src.Part1_Basic_Caculator;

import java.util.Scanner;
import java.lang.Math;

public class Vd7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên N: ");
        int n = scanner.nextInt();

        // Lấy trị tuyệt đối để xử lý số âm
        int soDuong = Math.abs(n);

        // Chia lấy phần nguyên cho 10 để loại bỏ chữ số cuối cùng
        int soMoi = soDuong / 10;

        // Lấy chữ số cuối cùng của số mới
        int chuSoGanCuoi = soMoi % 10;

        System.out.println("Chữ số gần cuối của " + n + " là: " + chuSoGanCuoi);

        scanner.close();
    }
}