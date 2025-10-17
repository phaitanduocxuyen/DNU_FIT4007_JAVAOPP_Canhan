package src.Array_in_Java;

import java.util.Scanner;

public class VD8_MaxAndCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập N: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        if (n > 0) {
            int maxVal = a[0];
            for (int i = 1; i < n; i++) {
                if (a[i] > maxVal) {
                    maxVal = a[i];
                }
            }

            int count = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == maxVal) {
                    count++;
                }
            }

            System.out.println("Giá trị lớn nhất (max): " + maxVal);
            System.out.println("Số lượng phần tử mang giá trị " + maxVal + " là: " + count);
        } else {
            System.out.println("Mảng rỗng.");
        }
    }
}