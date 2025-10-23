package src.Part13_Abstract_OPP.VD3;

public class StudentIT extends Student {
    private double javaScore;
    private double htmlScore;

    public StudentIT(String masv, String name, int age, double javaScore, double htmlScore) {
        super(masv, name, age);
        this.javaScore = javaScore;
        this.htmlScore = htmlScore;
    }

    @Override
    public double getAvgScore() {
        return (javaScore + htmlScore) / 2;
    }
}
