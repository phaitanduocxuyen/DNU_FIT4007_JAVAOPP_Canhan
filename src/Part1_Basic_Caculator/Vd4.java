package src.Part1_Basic_Caculator;

import java.util.Scanner;
import java.lang.Math;

public class Vd4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập cạnh a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập cạnh b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập cạnh c: ");
        double c = scanner.nextDouble();

        double chuVi = a + b + c;

        // Áp dụng công thức Heron để tính diện tích
        double p = chuVi / 2; // Nửa chu vi
        double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("Chu vi của tam giác là: " + chuVi);
        System.out.println("Diện tích của tam giác là: " + dienTich);

        scanner.close();
    }
}