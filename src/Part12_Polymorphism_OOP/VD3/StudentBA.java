package src.Part12_Polymorphism_OOP.VD3;
import java.util.Scanner;

public class StudentBA extends Student {
    private float scoreMarketing;
    private float scoreAccounting;

    public StudentBA() {}

    public StudentBA(String studentID, String name, int age, float scoreMarketing, float scoreAccounting) {
        super(studentID, name, age);
        setScoreMarketing(scoreMarketing);
        setScoreAccounting(scoreAccounting);
    }

    public float getScoreMarketing() { return scoreMarketing; }
    public void setScoreMarketing(float scoreMarketing) {
        this.scoreMarketing = (scoreMarketing >= 0 && scoreMarketing <= 10) ? scoreMarketing : 0;
    }

    public float getScoreAccounting() { return scoreAccounting; }
    public void setScoreAccounting(float scoreAccounting) {
        this.scoreAccounting = (scoreAccounting >= 0 && scoreAccounting <= 10) ? scoreAccounting : 0;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm Marketing: ");
        setScoreMarketing(sc.nextFloat());
        System.out.print("Nhập điểm Kế toán: ");
        setScoreAccounting(sc.nextFloat());
    }

    public float calculateAverage() {
        return (scoreMarketing + scoreAccounting) / 2;
    }

    @Override
    public StudentBA copyObject() {
        return new StudentBA(studentID, name, age, scoreMarketing, scoreAccounting);
    }

    @Override
    public String toString() {
        return "[BA] " + super.toString() + ", Marketing: " + scoreMarketing +
                ", Accounting: " + scoreAccounting +
                ", Average: " + calculateAverage();
    }
}
