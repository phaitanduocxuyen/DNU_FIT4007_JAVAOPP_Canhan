package src.Part6_String_in_Java;

import java.util.Scanner;

public class VD6_CheckPangram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();

        String checkStr = str.toLowerCase().replaceAll("[^a-z]", "");

        boolean isPangram = true;

        for (char c = 'a'; c <= 'z'; c++) {
            if (checkStr.indexOf(c) == -1) {
                isPangram = false;
                break;
            }
        }

        if (isPangram) {
            System.out.println("Chuỗi là chuỗi Pangram.");
        } else {
            System.out.println("Chuỗi KHÔNG là chuỗi Pangram.");
        }
    }
}