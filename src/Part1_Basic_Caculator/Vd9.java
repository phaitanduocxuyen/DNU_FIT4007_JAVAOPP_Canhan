package src.Part1_Basic_Caculator;

import java.util.Scanner;

public class Vd9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();

        // Sử dụng một lệnh in duy nhất
        System.out.println(a + " / " + b + " = " + ((double) a / b));

        scanner.close();
    }
}