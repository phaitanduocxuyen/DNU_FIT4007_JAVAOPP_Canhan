package src.String_in_Java.Switch_Case_Command;

import java.util.Scanner;

public class VD2_GenderIdentification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter gender code (0: Male, 1: Female, 2: Other): ");
        int gender = scanner.nextInt();

        switch (gender) {
            case 0 -> System.out.println("Nam");
            case 1 -> System.out.println("Nữ");
            case 2 -> System.out.println("Khác");
            default -> System.out.println("Không xác định");
        }
    }
}
