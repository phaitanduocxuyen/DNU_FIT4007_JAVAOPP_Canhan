package src.String_in_Java.Method_programming;

import java.util.Scanner;

public class VD5_CalculateFactorial {

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("N phải không âm.");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = sc.nextInt();

        try {
            long result = factorial(n);
            System.out.println(n + "! = " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}