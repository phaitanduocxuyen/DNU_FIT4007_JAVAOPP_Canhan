package src.Method_programming;

import java.util.Scanner;

public class VD9_GCDOfTwoNumbers {

    public static int gcd(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Các số phải không âm.");
        }
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int num1 = sc.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int num2 = sc.nextInt();

        try {
            int result = gcd(num1, num2);
            System.out.println("Ước chung lớn nhất của " + num1 + " và " + num2 + " là: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}