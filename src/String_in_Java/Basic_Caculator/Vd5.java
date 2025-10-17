package src.String_in_Java.Basic_Caculator;

import java.util.Scanner;

public class Vd5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tuổi của sinh viên: ");
        int tuoi = scanner.nextInt();
        int namHienTai = 2025;
        int namSinh = namHienTai - tuoi;
        System.out.println("Năm sinh của sinh viên đó là: " + namSinh);

        scanner.close();
    }
}