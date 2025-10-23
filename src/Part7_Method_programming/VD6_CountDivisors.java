package src.Part7_Method_programming;

import java.util.Scanner;

public class VD6_CountDivisors {

    public static int countDivisors(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("N phải là số nguyên dương.");
        }
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i * i == n) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = sc.nextInt();

        try {
            int result = countDivisors(n);
            System.out.println("Số ước của " + n + " là: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}