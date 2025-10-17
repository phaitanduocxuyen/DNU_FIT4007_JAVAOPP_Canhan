package src.Method_programming;

import java.util.Scanner;

public class VD17_GetLastDigit {

    public static int getLastDigit(int n) {
        return Math.abs(n) % 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int n = sc.nextInt();

        int result = getLastDigit(n);
        System.out.println("Chữ số cuối cùng là: " + result);
    }
}