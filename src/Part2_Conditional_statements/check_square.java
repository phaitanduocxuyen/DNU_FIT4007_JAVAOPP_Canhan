package src.Part2_Conditional_statements;
import java.util.Scanner;

public class check_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dai = sc.nextDouble();
        double rong = sc.nextDouble();
        if (dai == rong) {
            System.out.println("La hinh vuong");
        } else {
            System.out.println("Khong phai hinh vuong");
        }
    }
}
