package src.Part12_Polymorphism_OOP.VD5;
import java.util.Scanner;

public class StudentIT extends Student {
    private float scoreCPP;
    private float scoreJava;

    public StudentIT() {}

    public StudentIT(String studentID, String name, int age, float scoreCPP, float scoreJava) {
        super(studentID, name, age);
        setScoreCPP(scoreCPP);
        setScoreJava(scoreJava);
    }

    public float getScoreCPP() { return scoreCPP; }
    public void setScoreCPP(float scoreCPP) {
        this.scoreCPP = (scoreCPP >= 0 && scoreCPP <= 10) ? scoreCPP : 0;
    }

    public float getScoreJava() { return scoreJava; }
    public void setScoreJava(float scoreJava) {
        this.scoreJava = (scoreJava >= 0 && scoreJava <= 10) ? scoreJava : 0;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm C++: ");
        setScoreCPP(sc.nextFloat());
        System.out.print("Nhập điểm Java: ");
        setScoreJava(sc.nextFloat());
    }

    public float calculateAverage() {
        return (scoreCPP + scoreJava) / 2;
    }

    @Override
    public StudentIT copyObject() {
        return new StudentIT(studentID, name, age, scoreCPP, scoreJava);
    }

    @Override
    public String toString() {
        return "[IT] " + super.toString() + ", C++: " + scoreCPP + ", Java: " + scoreJava +
                ", Avg: " + calculateAverage();
    }
}
