package src.Conditional_statements;
import java.util.Scanner;

public class TriangleSidesCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
            System.out.println("La 3 canh tam giac");
        } else {
            System.out.println("Khong phai 3 canh tam giac");
        }
    }
}
