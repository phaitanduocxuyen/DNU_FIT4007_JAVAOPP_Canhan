package src.Part7_Method_programming;

import java.util.Scanner;

public class VD21_ArrayUtils {
    public static void printArray(int[] arr) {
        if (arr == null) {
            System.out.println("[]");
            return;
        }

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[] reverseArray(int[] arr) {
        if (arr == null) return null;

        int n = arr.length;
        int[] reversed = new int[n];

        for (int i = 0; i < n; i++) {
            reversed[i] = arr[n - 1 - i];
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử N: ");
        int n = sc.nextInt();

        int[] originalArray = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            originalArray[i] = sc.nextInt();
        }

        System.out.print("Mảng gốc: ");
        printArray(originalArray);

        int[] reversedArray = reverseArray(originalArray);
        System.out.print("Mảng đảo ngược: ");
        printArray(reversedArray);
    }
}