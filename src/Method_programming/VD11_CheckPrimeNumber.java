package src.Method_programming;

import java.util.Scanner;

public class VD11_CheckPrimeNumber {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " là số nguyên tố.");
        } else {
            System.out.println(num + " KHÔNG là số nguyên tố.");
        }
    }
}