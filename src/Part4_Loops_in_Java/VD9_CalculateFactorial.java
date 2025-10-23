package src.Part4_Loops_in_Java;

import java.util.Scanner;

public class VD9_CalculateFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= N; i++) {
            factorial *= i;
        }
        System.out.println(N + "! = " + factorial);
    }
}
