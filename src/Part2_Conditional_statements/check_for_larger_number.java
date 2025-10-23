package src.Part2_Conditional_statements;
import java.util.Scanner;
public class check_for_larger_number {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a > b) {
                System.out.println(a);
            } else {
                System.out.println(b);
            }
        }
    }
