package Loops_in_Java;

import java.util.Scanner;

public class VD5_PrintEvenNumbersUpToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 2; i <= N; i += 2) {
            System.out.println(i);
        }
    }
}
