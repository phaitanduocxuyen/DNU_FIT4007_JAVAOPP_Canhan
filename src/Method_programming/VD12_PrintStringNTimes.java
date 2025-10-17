package src.Method_programming;

import java.util.Scanner;

public class VD12_PrintStringNTimes {

    public static void printString(int n, String s) {
        if (n < 0) return;

        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi s: ");
        String s = sc.nextLine();
        System.out.print("Nhập số lần n: ");
        int n = sc.nextInt();

        printString(n, s);
    }
}