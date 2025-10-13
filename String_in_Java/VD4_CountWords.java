package String_in_Java;

import java.util.Scanner;

public class VD4_CountWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine().trim();

        if (str.isEmpty()) {
            System.out.println("Số từ trong chuỗi là: 0");
            return;
        }

        String[] words = str.split("\\s+");

        System.out.println("Số từ trong chuỗi là: " + words.length);
    }
}