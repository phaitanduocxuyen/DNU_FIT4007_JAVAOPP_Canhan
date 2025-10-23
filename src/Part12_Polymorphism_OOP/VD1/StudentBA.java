package src.Part12_Polymorphism_OOP.VD1;
import java.util.Scanner;

public class StudentBA extends Student {
    private float scorePM;
    private float scoreBA;

    public StudentBA() {}

    public StudentBA(String studentID, String name, int age, float scorePM, float scoreBA) {
        super(studentID, name, age);
        setScorePM(scorePM);
        setScoreBA(scoreBA);
    }

    public float getScorePM() { return scorePM; }
    public void setScorePM(float scorePM) {
        this.scorePM = (scorePM >= 0 && scorePM <= 10) ? scorePM : 0;
    }

    public float getScoreBA() { return scoreBA; }
    public void setScoreBA(float scoreBA) {
        this.scoreBA = (scoreBA >= 0 && scoreBA <= 10) ? scoreBA : 0;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm Quản lí dự án: ");
        setScorePM(sc.nextFloat());
        System.out.print("Nhập điểm Phân tích kinh doanh: ");
        setScoreBA(sc.nextFloat());
    }

    public float calculateAverage() {
        return (scorePM + scoreBA) / 2;
    }

    @Override
    public StudentBA copyObject() {
        return new StudentBA(studentID, name, age, scorePM, scoreBA);
    }

    @Override
    public String toString() {
        return "[BA] " + super.toString() + ", PM: " + scorePM + ", BA: " + scoreBA +
                ", Average: " + calculateAverage();
    }
}
