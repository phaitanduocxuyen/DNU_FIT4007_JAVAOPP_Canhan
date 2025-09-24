package Basic_Caculator;

import java.util.Scanner;

public class Vd10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một ký tự thường (từ 'a' đến 'y'): ");
        char ch = scanner.next().charAt(0);

        // Ép kiểu ký tự thành số nguyên rồi cộng 1, sau đó ép ngược lại về ký tự
        char kyTuLienSau = (char) (ch + 1);

        System.out.println("Ký tự liền sau là: " + kyTuLienSau);

        scanner.close();
    }
}