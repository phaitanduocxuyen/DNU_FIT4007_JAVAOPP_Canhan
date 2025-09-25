package Loops_in_Java;

import java.util.Scanner;

public class VD4_SumFrom1ToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}
