package src.String_in_Java.Array_in_Java;

import java.util.Scanner;

public class VD11_LastMaxIndex {

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

            int lastMaxIndex = -1;
            for (int i = n - 1; i >= 0; i--) {
                if (a[i] == maxVal) {
                    lastMaxIndex = i;
                    break;
                }
            }

            System.out.println("Chỉ số của phần tử lớn nhất cuối cùng là: " + lastMaxIndex);
        } else {
            System.out.println("Mảng rỗng.");
        }
    }
}