package src.Part5_Array_in_Java;

import java.util.Scanner;

public class VD13_CheckNonDecreasing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập N: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        boolean isNonDecreasing = true;

        if (n > 1) {
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    isNonDecreasing = false;
                    break;
                }
            }
        }

        if (isNonDecreasing) {
            System.out.println("Mảng là mảng không giảm.");
        } else {
            System.out.println("Mảng KHÔNG là mảng không giảm.");
        }
    }
}