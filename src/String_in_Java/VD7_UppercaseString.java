package src.String_in_Java;

import java.util.Scanner;

public class VD7_UppercaseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();

        String upperCaseStr = str.toUpperCase();

        System.out.println("Chuỗi in hoa là: " + upperCaseStr);
    }
}