import java.util.Scanner;

public class Vd2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bán kính của hình tròn: ");
        double banKinh = scanner.nextDouble();
        double chuVi = 2 * Math.PI * banKinh;
        double dienTich = Math.PI * banKinh * banKinh;
        System.out.println("Chu vi của hình tròn là: " + chuVi);
        System.out.println("Diện tích của hình tròn là: " + dienTich);

        scanner.close();
    }
}