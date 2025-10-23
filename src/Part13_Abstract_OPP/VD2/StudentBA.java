package src.Part13_Abstract_OPP.VD2;

import java.util.Scanner;

public class StudentBA extends Student {
    private float scorePm;
    private float scoreBA;

    public StudentBA() {}

    public StudentBA(String masv, String name, int age, float scorePm, float scoreBA) {
        super(masv, name, age);
        this.scorePm = checkScore(scorePm);
        this.scoreBA = checkScore(scoreBA);
    }

    public float getScorePm() {
        return scorePm;
    }

    public void setScorePm(float scorePm) {
        this.scorePm = checkScore(scorePm);
    }

    public float getScoreBA() {
        return scoreBA;
    }

    public void setScoreBA(float scoreBA) {
        this.scoreBA = checkScore(scoreBA);
    }

    private float checkScore(float score) {
        return (score >= 0 && score <= 10) ? score : 0;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm Quản lý dự án: ");
        scorePm = checkScore(sc.nextFloat());
        System.out.print("Nhập điểm Phân tích kinh doanh: ");
        scoreBA = checkScore(sc.nextFloat());
    }

    @Override
    public float calculateAverage() {
        return (scorePm + scoreBA) / 2;
    }

    @Override
    public String toString() {
        return "StudentBA [MãSV=" + getMasv() + ", Tên=" + getName() + ", Tuổi=" + getAge() +
                ", Quản lý DA=" + scorePm + ", Phân tích KD=" + scoreBA +
                ", Trung bình=" + calculateAverage() + "]";
    }
}
