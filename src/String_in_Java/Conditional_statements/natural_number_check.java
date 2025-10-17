package src.String_in_Java.Conditional_statements;
import java.util.Scanner;

public class natural_number_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N >= 0) {
            System.out.println("N la so tu nhien");
        } else {
            System.out.println("N khong phai so tu nhien");
        }
    }
}
