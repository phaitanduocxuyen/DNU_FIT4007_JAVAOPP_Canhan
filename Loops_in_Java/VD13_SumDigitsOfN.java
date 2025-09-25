package Loops_in_Java;

import java.util.Scanner;

public class VD13_SumDigitsOfN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = 0;
        while (N > 0) {
            sum += N % 10;
            N /= 10;
        }
        System.out.println("Sum of digits = " + sum);
    }
}
