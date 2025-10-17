package src.String_in_Java.Array_in_Java;

import java.util.Scanner;

public class VD3_PrintArrayReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập N: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        System.out.println("Mảng in ngược là:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
    }
}