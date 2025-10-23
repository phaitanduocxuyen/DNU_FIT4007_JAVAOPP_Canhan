package src.Part6_String_in_Java;

import java.util.Scanner;

public class VD1_ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String original = sc.nextLine();

        StringBuilder reversed = new StringBuilder(original).reverse();

        System.out.println("Chuỗi đảo ngược: " + reversed.toString());
    }
}