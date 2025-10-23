package src.Part6_String_in_Java;

import java.util.Scanner;

public class VD2_CountCharA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();

        String lowerCaseStr = str.toLowerCase();
        int count = 0;

        for (int i = 0; i < lowerCaseStr.length(); i++) {
            if (lowerCaseStr.charAt(i) == 'a') {
                count++;
            }
        }

        System.out.println("Số ký tự 'a' (bao gồm cả 'A') trong chuỗi là: " + count);
    }
}