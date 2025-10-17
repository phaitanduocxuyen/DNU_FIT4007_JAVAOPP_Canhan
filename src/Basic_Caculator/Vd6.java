package src.Basic_Caculator;

import java.util.Scanner;
import java.lang.Math;

public class Vd6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên N: ");
        int n = scanner.nextInt();

        // Lấy trị tuyệt đối để xử lý số âm
        int soDuong = Math.abs(n);

        // Phép chia lấy dư (%) cho 10 sẽ trả về chữ số cuối cùng
        int chuSoCuoi = soDuong % 10;

        System.out.println("Chữ số cuối cùng của " + n + " là: " + chuSoCuoi);

        scanner.close();
    }
}