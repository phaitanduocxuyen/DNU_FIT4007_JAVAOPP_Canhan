package src.Conditional_statements;
import java.util.Scanner;

public class IsPerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double sqrtN = Math.sqrt(N);
        if (sqrtN == (int) sqrtN) {
            System.out.println("La so chinh phuong");
        } else {
            System.out.println("Khong phai so chinh phuong");
        }
    }
}