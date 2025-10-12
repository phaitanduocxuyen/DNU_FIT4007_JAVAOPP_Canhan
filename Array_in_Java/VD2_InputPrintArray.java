package Array_in_Java;
import java.util.Scanner;
public class VD2_InputPrintArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Nhập N: ");
            int n = sc.nextInt();

            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("A[" + i + "] = ");
                a[i] = sc.nextInt();
            }

            System.out.println("Mảng vừa nhập là:");
            for (int i = 0; i < n; i++)
                System.out.print(a[i] + " ");

            System.out.println();
        }
    }
