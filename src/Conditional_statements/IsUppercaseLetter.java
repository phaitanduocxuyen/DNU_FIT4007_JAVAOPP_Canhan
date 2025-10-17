package src.Conditional_statements;
import java.util.Scanner;

public class IsUppercaseLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("La chu cai in hoa");
        } else {
            System.out.println("Khong phai chu cai in hoa");
        }
    }
}
