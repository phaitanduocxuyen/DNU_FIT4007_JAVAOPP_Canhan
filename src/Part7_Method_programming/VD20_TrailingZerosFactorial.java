package src.Part7_Method_programming;

import java.util.Scanner;

public class VD20_TrailingZerosFactorial {

    public static int countTrailingZeros(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("N phải không âm.");
        }
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = sc.nextInt();

        try {
            int result = countTrailingZeros(n);
            System.out.println("Số lượng chữ số 0 cuối cùng của " + n + "! là: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}