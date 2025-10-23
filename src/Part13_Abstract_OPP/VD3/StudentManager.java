package src.Part13_Abstract_OPP.VD3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentManager implements IManager {
    private ArrayList<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void editStudent(String masv, Student newStudent) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getMasv().equals(masv)) {
                students.set(i, newStudent);
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên có mã: " + masv);
    }

    @Override
    public void removeStudent(String masv) {
        students.removeIf(s -> s.getMasv().equals(masv));
    }

    @Override
    public Student findStudent(String masv) {
        for (Student s : students) {
            if (s.getMasv().equals(masv)) return s;
        }
        return null;
    }

    @Override
    public ArrayList<Student> findStudent(int age) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student s : students) {
            if (s.getAge() == age) result.add(s);
        }
        return result;
    }

    @Override
    public void sortByAge() {
        Collections.sort(students, Comparator.comparingInt(Student::getAge));
    }

    @Override
    public void sortByScore() {
        Collections.sort(students, Comparator.comparingDouble(Student::getAvgScore));
    }

    @Override
    public void displayAllStudents() {
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
