package src.String_in_Java.Basic_Caculator;

import java.util.Scanner;

public class Vd3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều dài: ");
        double chieuDai = scanner.nextDouble();

        System.out.print("Nhập chiều rộng: ");
        double chieuRong = scanner.nextDouble();

        double chuVi = (chieuDai + chieuRong) * 2;
        double dienTich = chieuDai * chieuRong;

        System.out.println("Chu vi của hình chữ nhật là: " + chuVi);
        System.out.println("Diện tích của hình chữ nhật là: " + dienTich);

        scanner.close();
    }
}