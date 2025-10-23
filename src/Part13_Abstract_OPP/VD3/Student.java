package src.Part13_Abstract_OPP.VD3;

public abstract class Student {
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

    // Phương thức trừu tượng để tính điểm trung bình
    public abstract double getAvgScore();

    @Override
    public String toString() {
        return masv + " - " + name + " - Tuổi: " + age + " - Điểm TB: " + getAvgScore();
    }
}

