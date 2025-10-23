package src.Part13_Abstract_OPP.VD4;

public class StudentBA extends Student {
    private double marketing;
    private double sales;

    public StudentBA(String masv, String name, int age, double marketing, double sales) {
        super(masv, name, age);
        this.marketing = marketing;
        this.sales = sales;
    }

    @Override
    public double getAvgScore() {
        return (marketing + sales) / 2;
    }
}

