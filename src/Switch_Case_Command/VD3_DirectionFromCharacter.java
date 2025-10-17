package src.Switch_Case_Command;
import java.util.Scanner;

public class VD3_DirectionFromCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a direction character (N/S/E/W): ");
        char ch = scanner.next().toUpperCase().charAt(0);

        switch (ch) {
            case 'N' -> System.out.println("Hướng Bắc");
            case 'S' -> System.out.println("Hướng Nam");
            case 'E' -> System.out.println("Hướng Tây");
            case 'W' -> System.out.println("Hướng Đông");
            default -> System.out.println("Ký tự không hợp lệ");
        }
    }
}
