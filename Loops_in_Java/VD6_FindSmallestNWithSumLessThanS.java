package Loops_in_Java;
import java.util.Scanner;

public class VD6_FindSmallestNWithSumLessThanS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int sum = 0, N = 0;
        while (sum + N + 1 <= S) {
            N++;
            sum += N;
        }
        System.out.println("Smallest N = " + N);
    }
}
