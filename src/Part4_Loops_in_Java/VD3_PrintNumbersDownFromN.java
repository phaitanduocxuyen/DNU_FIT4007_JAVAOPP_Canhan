package src.Part4_Loops_in_Java;
import java.util.Scanner;

public class VD3_PrintNumbersDownFromN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = N; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
