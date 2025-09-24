package Conditional_statements;
import java.util.Scanner;

public class AreStringsEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        if (a.equals(b)) {
            System.out.println("Hai chuoi giong nhau");
        } else {
            System.out.println("Hai chuoi khong giong nhau");
        }
    }
}