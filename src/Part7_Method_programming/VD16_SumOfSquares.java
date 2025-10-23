package src.Part7_Method_programming;

import java.util.Scanner;

public class VD16_SumOfSquares {

    public static long sumSquares(int n) {
        if (n < 1) {
            return 0;
        }
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (long) i * i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = sc.nextInt();

        long result = sumSquares(n);
        System.out.println("Tổng 1^2 + ... + " + n + "^2 là: " + result);
    }
}