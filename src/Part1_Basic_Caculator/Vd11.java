package src.Part1_Basic_Caculator;

public class Vd11 {
    public static void main(String[] args) {
        int a = 7;
        int b = 5;

        System.out.println("Trước khi hoán đổi: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Sau khi hoán đổi: a = " + a + ", b = " + b);
    }
}