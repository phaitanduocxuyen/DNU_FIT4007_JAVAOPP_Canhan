package String_in_Java;

import java.util.Scanner;

public class VD5_CheckContainsDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();

        boolean containsDigit = false;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                containsDigit = true;
                break;
            }
        }

        if (containsDigit) {
            System.out.println("Chuỗi có chứa ít nhất một ký tự số.");
        } else {
            System.out.println("Chuỗi KHÔNG chứa ký tự số nào.");
        }
    }
}