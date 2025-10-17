package src.Loops_in_Java;
import java.util.Scanner;

public class VD12_CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        boolean isPrime = N > 1;
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "Prime" : "Not Prime");
    }
}
