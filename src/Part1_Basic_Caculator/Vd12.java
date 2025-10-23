package src.Part1_Basic_Caculator;

public class Vd12 {
    public static void main(String[] args) {
        int a = 7;
        int b = 5;

        System.out.println("Trước khi hoán đổi: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Sau khi hoán đổi: a = " + a + ", b = " + b);
    }
}
