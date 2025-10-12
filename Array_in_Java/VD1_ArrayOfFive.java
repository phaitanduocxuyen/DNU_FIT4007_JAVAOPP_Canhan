package Array_in_Java;

import java.util.Scanner;

    public class VD1_ArrayOfFive {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] a = new int[5];

            System.out.println("Nhập 5 phần tử của mảng:");

            for (int i = 0; i < 5; i++) {
                System.out.print("A[" + i + "] = ");
                a[i] = sc.nextInt();
            }

            System.out.println("Mảng vừa nhập là:");
            for (int i = 0; i < 5; i++) {
                System.out.print(a[i] + " ");
            }

            System.out.println();
        }
    }
