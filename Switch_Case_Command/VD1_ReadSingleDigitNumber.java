package Switch_Case_Command;

import java.util.Scanner;

public class VD1_ReadSingleDigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single-digit number (0-9): ");
        int N = scanner.nextInt();

        switch (N) {
            case 0 -> System.out.println("Không");
            case 1 -> System.out.println("Một");
            case 2 -> System.out.println("Hai");
            case 3 -> System.out.println("Ba");
            case 4 -> System.out.println("Bốn");
            case 5 -> System.out.println("Năm");
            case 6 -> System.out.println("Sáu");
            case 7 -> System.out.println("Bảy");
            case 8 -> System.out.println("Tám");
            case 9 -> System.out.println("Chín");
            default -> System.out.println("Không hợp lệ");
        }
    }
}
