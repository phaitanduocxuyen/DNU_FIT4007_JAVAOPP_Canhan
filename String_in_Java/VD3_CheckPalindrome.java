package String_in_Java;

import java.util.Scanner;

public class VD3_CheckPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();

        String reversedStr = new StringBuilder(str).reverse().toString();

        if (str.equals(reversedStr)) {
            System.out.println("Chuỗi \"" + str + "\" là chuỗi đối xứng.");
        } else {
            System.out.println("Chuỗi \"" + str + "\" KHÔNG là chuỗi đối xứng.");
        }
    }
}