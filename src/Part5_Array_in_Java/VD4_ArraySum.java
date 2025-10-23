package src.Part5_Array_in_Java;

import java.util.Scanner;

public class VD4_ArraySum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập N: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        long sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            a[i] = sc.nextInt();
            sum += a[i];
        }

        System.out.println("Tổng của mảng là: " + sum);
    }
}