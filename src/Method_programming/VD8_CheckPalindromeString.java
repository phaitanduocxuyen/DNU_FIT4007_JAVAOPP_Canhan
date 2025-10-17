package src.Method_programming;

import java.util.Scanner;

public class VD8_CheckPalindromeString {

    public static boolean isPalindrome(String str) {
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String inputStr = sc.nextLine();

        if (isPalindrome(inputStr)) {
            System.out.println("Chuỗi \"" + inputStr + "\" là chuỗi đối xứng.");
        } else {
            System.out.println("Chuỗi \"" + inputStr + "\" KHÔNG là chuỗi đối xứng.");
        }
    }
}