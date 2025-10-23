package src.Part13_Abstract_OPP.VD2;

import java.util.Scanner;
public class StudentIT extends Student {
    private float scoreCpp;
    private float scoreJava;

    public StudentIT() {}

    public StudentIT(String masv, String name, int age, float scoreCpp, float scoreJava) {
        super(masv, name, age);
        this.scoreCpp = checkScore(scoreCpp);
        this.scoreJava = checkScore(scoreJava);
    }

    public float getScoreCpp() {
        return scoreCpp;
    }

    public void setScoreCpp(float scoreCpp) {
        this.scoreCpp = checkScore(scoreCpp);
    }

    public float getScoreJava() {
        return scoreJava;
    }

    public void setScoreJava(float scoreJava) {
        this.scoreJava = checkScore(scoreJava);
    }

    private float checkScore(float score) {
        return (score >= 0 && score <= 10) ? score : 0;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm C++: ");
        scoreCpp = checkScore(sc.nextFloat());
        System.out.print("Nhập điểm Java: ");
        scoreJava = checkScore(sc.nextFloat());
    }

    @Override
    public float calculateAverage() {
        return (scoreCpp + scoreJava) / 2;
    }

    @Override
    public String toString() {
        return "StudentIT [MãSV=" + getMasv() + ", Tên=" + getName() + ", Tuổi=" + getAge() +
                ", C++=" + scoreCpp + ", Java=" + scoreJava +
                ", Trung bình=" + calculateAverage() + "]";
    }
}

