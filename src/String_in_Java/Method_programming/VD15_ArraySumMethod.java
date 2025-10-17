package src.String_in_Java.Method_programming;

import java.util.Scanner;

public class VD15_ArraySumMethod {

    public static long arraySum(int[] arr) {
        long sum = 0;
        if (arr == null) return 0;

        for (int element : arr) {
            sum += element;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử N: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        long result = arraySum(arr);
        System.out.println("Tổng của mảng là: " + result);
    }
}