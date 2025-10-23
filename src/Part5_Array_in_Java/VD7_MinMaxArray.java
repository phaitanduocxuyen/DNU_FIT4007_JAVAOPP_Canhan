package src.Part5_Array_in_Java;

import java.util.Scanner;

public class VD7_MinMaxArray {

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
            int minVal = a[0];

            for (int i = 1; i < n; i++) {
                if (a[i] > maxVal) {
                    maxVal = a[i];
                }
                if (a[i] < minVal) {
                    minVal = a[i];
                }
            }

            System.out.println("Giá trị lớn nhất: " + maxVal);
            System.out.println("Giá trị nhỏ nhất: " + minVal);
        } else {
            System.out.println("Mảng rỗng.");
        }
    }
}