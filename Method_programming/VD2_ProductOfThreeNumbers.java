package Method_programming;

import java.util.Scanner;

public class VD2_ProductOfThreeNumbers {

    public static long product(int a, int b, int c) {
        return (long) a * b * c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int num1 = sc.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int num2 = sc.nextInt();
        System.out.print("Nhập số thứ ba: ");
        int num3 = sc.nextInt();

        long result = product(num1, num2, num3);
        System.out.println("Tích của ba số là: " + result);
    }
}