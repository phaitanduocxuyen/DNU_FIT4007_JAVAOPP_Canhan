package src.Method_programming;

import java.util.Scanner;

public class VD14_DecimalToBinary {

    public static String toBinary(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("N phải là số tự nhiên.");
        }
        if (n == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        int temp = n;
        while (temp > 0) {
            binary.append(temp % 2);
            temp /= 2;
        }
        return binary.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tự nhiên N: ");
        int n = sc.nextInt();

        try {
            String result = toBinary(n);
            System.out.println("Chuỗi nhị phân của " + n + " là: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}