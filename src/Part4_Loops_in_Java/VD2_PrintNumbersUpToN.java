package src.Part4_Loops_in_Java;
import java.util.Scanner;

public class VD2_PrintNumbersUpToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
    }
}
