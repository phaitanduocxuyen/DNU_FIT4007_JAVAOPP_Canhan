package src.String_in_Java;

import java.util.Scanner;

public class VD8_StarPyramidLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập N: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("N phải là số nguyên dương.");
            return;
        }

        System.out.println("Tháp '*' với 1 vòng lặp:");

        // Sử dụng String.repeat() (Java 11+)
        for (int i = 1; i <= n; i++) {
            System.out.println("*".repeat(i));
        }
    }
}