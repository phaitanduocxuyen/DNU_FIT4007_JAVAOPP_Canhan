package src.Part7_Method_programming;

import java.util.Scanner;

public class VD3_CheckNaturalNumber {

    public static boolean isNatural(int n) {
        return n > 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int num = sc.nextInt();

        if (isNatural(num)) {
            System.out.println(num + " là số tự nhiên.");
        } else {
            System.out.println(num + " KHÔNG là số tự nhiên.");
        }
    }
}