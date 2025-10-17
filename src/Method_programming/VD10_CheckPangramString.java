package src.Method_programming;

import java.util.Scanner;

public class VD10_CheckPangramString {

    public static boolean isPangram(String str) {
        String checkStr = str.toLowerCase().replaceAll("[^a-z]", "");

        for (char c = 'a'; c <= 'z'; c++) {
            if (checkStr.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String inputStr = sc.nextLine();

        if (isPangram(inputStr)) {
            System.out.println("Chuỗi là chuỗi Pangram.");
        } else {
            System.out.println("Chuỗi KHÔNG là chuỗi Pangram.");
        }
    }
}