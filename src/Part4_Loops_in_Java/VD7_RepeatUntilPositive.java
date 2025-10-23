package src.Part4_Loops_in_Java;

import java.util.Scanner;

public class VD7_RepeatUntilPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        do {
            System.out.print("Enter a positive number: ");
            N = scanner.nextInt();
        } while (N <= 0);
        System.out.println("You entered: " + N);
    }
}
