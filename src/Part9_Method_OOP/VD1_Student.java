package src.Part9_Method_OOP;

public class VD1_Student {
    private String masv;
    private String name;
    private int age;

    public VD1_Student() {
    }

    public VD1_Student(String masv, String name, int age) {
        this.masv = masv;
        this.name = name;
        this.age = age;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearOfBirth() {
        return java.time.Year.now().getValue() - age;
    }

    public String getUpperName() {
        return name.toUpperCase();
    }

    @Override
    public String toString() {
        return "Student{" + "masv='" + masv + '\'' + ", name='" + name + '\'' + ", age=" + age + '}';
    }
}
