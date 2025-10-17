package src.Array_in_Java;

import java.util.Scanner;

public class VD5_SumEvenElementsOddIndex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập N: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        long sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (i % 2 != 0 && a[i] % 2 == 0) {
                sum += a[i];
            }
        }

        System.out.println("Tổng các phần tử chẵn ở chỉ số lẻ là: " + sum);
    }
}