package src.Part14_MidtermExam.VD3;

public abstract class Student {
    protected String masv;
    protected String name;
    protected int age;

    public Student(String masv, String name, int age) {
        this.masv = masv;
        this.name = name;
        this.age = age;
    }

    public abstract double getAverageScore();

    public String getMasv() {
        return masv;
    }

    public int getAge() {
        return age;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return masv + " - " + name + " - " + age + " tuổi - ĐTB: " + getAverageScore();
    }
}

