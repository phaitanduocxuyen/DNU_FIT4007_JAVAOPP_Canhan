package src.Method_programming;

import java.util.Scanner;

public class VD7_SayHello {

    public static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String yourName = sc.nextLine();

        sayHello(yourName);
    }
}