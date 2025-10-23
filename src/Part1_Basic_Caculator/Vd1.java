package src.Part1_Basic_Caculator;

import java.util.Scanner;
public class Vd1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();
        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        double thuong = (double) a / b;
        System.out.println("Tổng của " + a + " và " + b + " là: " + tong);
        System.out.println("Hiệu của " + a + " và " + b + " là: " + hieu);
        System.out.println("Tích của " + a + " và " + b + " là: " + tich);
        System.out.println("Thương của " + a + " và " + b + " là: " + thuong);
        scanner.close();
    }
}