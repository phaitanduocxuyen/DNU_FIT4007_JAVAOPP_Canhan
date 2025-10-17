package src.Method_programming;

import java.util.Scanner;

public class VD18_GetFirstDigit {

    public static int getFirstDigit(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Số phải là số tự nhiên.");
        }
        if (n == 0) {
            return 0;
        }

        int temp = n;
        while (temp >= 10) {
            temp /= 10;
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một số tự nhiên: ");
        int n = sc.nextInt();

        try {
            int result = getFirstDigit(n);
            System.out.println("Chữ số đầu tiên là: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
