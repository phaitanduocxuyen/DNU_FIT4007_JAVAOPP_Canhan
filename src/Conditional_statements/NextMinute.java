package src.Conditional_statements;

import java.util.Scanner;

public class NextMinute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        m++;
        if (m == 60) {
            m = 0;
            h++;
            if (h == 24) {
                h = 0;
            }
        }
        System.out.println(h + ":" + (m < 10 ? "0" + m : m));
    }
}