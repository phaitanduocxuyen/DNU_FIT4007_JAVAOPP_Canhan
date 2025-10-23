package src.Part10_Pack_OOP.pB;

import src.Part10_Pack_OOP.pA.VD4_A;

public class VD4_C extends VD4_A {
    public static void main(String[] args) {
        VD4_C obj = new VD4_C();
        obj.setA(50);
        System.out.println("Giá trị a từ package khác: " + obj.getA());
    }
}
