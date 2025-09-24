package Switch_Case_Command;

import java.util.Scanner;

public class VD5_DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("Tháng " + month + " có 31 ngày");
            case 4, 6, 9, 11 -> System.out.println("Tháng " + month + " có 30 ngày");
            case 2 -> {
                if (isLeap)
                    System.out.println("Tháng 2 có 29 ngày (năm nhuận)");
                else
                    System.out.println("Tháng 2 có 28 ngày");
            }
            default -> System.out.println("Tháng không hợp lệ");
        }
    }
}
