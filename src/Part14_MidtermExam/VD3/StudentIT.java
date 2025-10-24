package src.Part14_MidtermExam.VD3;

public class StudentIT extends Student {
    private double java;
    private double csharp;

    public StudentIT(String masv, String name, int age, double java, double csharp) {
        super(masv, name, age);
        this.java = java;
        this.csharp = csharp;
    }

    @Override
    public double getAverageScore() {
        return (java + csharp) / 2;
    }
}

