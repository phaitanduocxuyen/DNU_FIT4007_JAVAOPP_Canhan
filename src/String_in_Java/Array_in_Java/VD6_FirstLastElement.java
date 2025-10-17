package src.String_in_Java.Array_in_Java;

import java.util.Scanner;

public class VD6_FirstLastElement {

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
            System.out.println("Phần tử đầu tiên: " + a[0]);
            System.out.println("Phần tử cuối cùng: " + a[n - 1]);
        } else {
            System.out.println("Mảng rỗng.");
        }
    }
}