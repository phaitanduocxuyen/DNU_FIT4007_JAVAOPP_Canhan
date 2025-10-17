package src.String_in_Java.Conditional_statements;
import java.util.Scanner;

public class IsInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        if (num == (int) num) {
            System.out.println("La so nguyen");
        } else {
            System.out.println("Khong phai so nguyen");
        }
    }
}
