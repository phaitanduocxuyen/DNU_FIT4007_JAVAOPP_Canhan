package Switch_Case_Command;
import java.util.Scanner;

public class VD4_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.print("Enter operator (+, -, *, /, %): ");
        char op = scanner.next().charAt(0);

        switch (op) {
            case '+' -> System.out.println(a + " + " + b + " = " + (a + b));
            case '-' -> System.out.println(a + " - " + b + " = " + (a - b));
            case '*' -> System.out.println(a + " * " + b + " = " + (a * b));
            case '/' -> {
                if (b != 0)
                    System.out.println(a + " / " + b + " = " + (a / b));
                else
                    System.out.println("Không thể chia cho 0");
            }
            case '%' -> {
                if (b != 0)
                    System.out.println(a + " % " + b + " = " + (a % b));
                else
                    System.out.println("Không thể chia cho 0");
            }
            default -> System.out.println("Phép toán không hợp lệ");
        }
    }
}
