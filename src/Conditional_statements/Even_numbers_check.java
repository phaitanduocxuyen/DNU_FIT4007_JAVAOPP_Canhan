package src.Conditional_statements;
import java.util.Scanner;
public class Even_numbers_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N % 2 == 0) {
            System.out.println("N la so chan");
        } else {
            System.out.println("N khong phai so chan");
        }
    }
}
