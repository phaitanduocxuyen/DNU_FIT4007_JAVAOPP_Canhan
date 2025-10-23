package src.Part2_Conditional_statements;
import java.util.Scanner;

public class IsLowercaseLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("La chu cai in thuong");
        } else {
            System.out.println("Khong phai chu cai in thuong");
        }
    }
}
