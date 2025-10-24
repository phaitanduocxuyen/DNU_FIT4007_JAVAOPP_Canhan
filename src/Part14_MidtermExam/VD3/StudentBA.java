package src.Part14_MidtermExam.VD3;

public class StudentBA extends Student {
    private double marketing;
    private double sale;

    public StudentBA(String masv, String name, int age, double marketing, double sale) {
        super(masv, name, age);
        this.marketing = marketing;
        this.sale = sale;
    }

    @Override
    public double getAverageScore() {
        return (marketing + sale) / 2;
    }
}

