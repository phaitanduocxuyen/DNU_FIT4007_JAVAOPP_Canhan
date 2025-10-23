package src.Part10_Pack_OOP.pB;

import src.Part10_Pack_OOP.pA.VD3_A;

public class VD3_C extends VD3_A {
    public static void main(String[] args) {
        VD3_C obj = new VD3_C();
        System.out.println("Bình phương a từ subclass khác package: " + obj.sqr());
    }
}
