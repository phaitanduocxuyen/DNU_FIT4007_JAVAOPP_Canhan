package src.Array_in_Java;

import java.util.Scanner;

public class VD12_DeleteElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập N: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        System.out.print("Nhập chỉ số k cần xoá (0 <= k < " + n + "): ");
        int k = sc.nextInt();

        if (k >= 0 && k < n) {
            // Tạo mảng mới có kích thước n-1
            int[] b = new int[n - 1];
            int indexB = 0;

            for (int i = 0; i < n; i++) {
                if (i != k) {
                    b[indexB] = a[i];
                    indexB++;
                }
            }

            System.out.println("Mảng sau khi xoá phần tử ở chỉ số " + k + " là:");
            for (int i = 0; i < n - 1; i++) {
                System.out.print(b[i] + " ");
            }
            System.out.println();

        } else {
            System.out.println("Chỉ số k không hợp lệ.");
        }
    }
}