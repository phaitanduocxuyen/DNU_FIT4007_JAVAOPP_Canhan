package src.Loops_in_Java;
import java.util.Scanner;

public class VD15_SumOfNMultipliedByNPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i * (i + 1);
        }
        System.out.println("Result = " + sum);
    }
}
