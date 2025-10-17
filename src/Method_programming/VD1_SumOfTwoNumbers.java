package src.Method_programming;

import java.util.Scanner;

public class VD1_SumOfTwoNumbers {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int num1 = sc.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int num2 = sc.nextInt();

        int result = sum(num1, num2);
        System.out.println("Tổng của hai số là: " + result);
    }
}