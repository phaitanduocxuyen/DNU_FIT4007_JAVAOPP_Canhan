package src.String_in_Java.Loops_in_Java;

import java.util.Scanner;

public class VD8_CheckPowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        boolean isPower = false;
        int value = 1;
        while (value <= N) {
            if (value == N) {
                isPower = true;
                break;
            }
            value *= 2;
        }
        System.out.println(isPower ? "Yes" : "No");
    }
}
