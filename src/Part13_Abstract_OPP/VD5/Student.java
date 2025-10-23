package src.Part13_Abstract_OPP.VD5;

import java.io.Serializable;

public abstract class Student implements Serializable {
    protected String masv;
    protected String name;
    protected int age;

    public Student(String masv, String name, int age) {
        this.masv = masv;
        this.name = name;
        this.age = age;
    }

    public String getMasv() {
        return masv;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract double getAvgScore();

    @Override
    public String toString() {
        return masv + " - " + name + " - Tuổi: " + age + " - Điểm TB: " + getAvgScore();
    }
}

