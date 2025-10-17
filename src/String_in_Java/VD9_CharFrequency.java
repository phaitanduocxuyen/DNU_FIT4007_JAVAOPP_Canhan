package src.String_in_Java;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class VD9_CharFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();

        Map<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        System.out.println("Kết quả:");

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println(entry.getKey() + " xuất hiện " + entry.getValue() + " lần");
        }
    }
}