package src.Method_programming;

import java.util.Scanner;

public class VD19_CheckPerfectSquare {

    public static boolean isPerfectSquare(int n) {
        if (n <= 0) {
            return false;
        }
        long root = (long) Math.sqrt(n);
        return root * root == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một số nguyên dương: ");
        int n = sc.nextInt();

        if (isPerfectSquare(n)) {
            System.out.println(n + " là số chính phương.");
        } else {
            System.out.println(n + " KHÔNG là số chính phương.");
        }
    }
}