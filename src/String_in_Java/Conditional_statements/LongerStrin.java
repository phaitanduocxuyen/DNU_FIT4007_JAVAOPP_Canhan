package src.String_in_Java.Conditional_statements;
import java.util.Scanner;
public class LongerStrin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        if (a.length() > b.length()) {
            System.out.println(a);
        } else if (b.length() > a.length()) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }
}