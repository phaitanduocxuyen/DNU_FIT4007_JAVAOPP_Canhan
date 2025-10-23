package src.Part2_Conditional_statements;

import java.util.Scanner;

public class CheckDivisorMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a % b == 0 && b % c == 0) {
            System.out.println("b la uoc cua a va boi cua c");
        } else {
            System.out.println("Khong thoa man");
        }
    }
}