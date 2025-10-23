package src.Part7_Method_programming;

import java.util.Scanner;

public class VD13_TriangleArea {

    public static double triangleArea(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Ba cạnh không tạo thành tam giác hợp lệ.");
            return 0.0;
        }

        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cạnh a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập cạnh b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập cạnh c: ");
        double c = sc.nextDouble();

        double result = triangleArea(a, b, c);
        if (result > 0) {
            System.out.println("Diện tích tam giác là: " + result);
        }
    }
}