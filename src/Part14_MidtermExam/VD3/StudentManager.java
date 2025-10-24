package src.Part14_MidtermExam.VD3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentManager implements IManager {
    private ArrayList<Student> list = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        list.add(student);
    }

    @Override
    public void editStudent(String masv, Student newStudent) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMasv().equals(masv)) {
                list.set(i, newStudent);
                return;
            }
        }
    }

    @Override
    public void removeStudent(String masv) {
        list.removeIf(s -> s.getMasv().equals(masv));
    }

    @Override
    public Student findStudent(String masv) {
        for (Student s : list) {
            if (s.getMasv().equals(masv)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Student> findStudent(int age) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student s : list) {
            if (s.getAge() == age) {
                result.add(s);
            }
        }
        return result;
    }

    @Override
    public void sortByAge() {
        Collections.sort(list, Comparator.comparingInt(Student::getAge));
    }

    @Override
    public void sortByScore() {
        Collections.sort(list, Comparator.comparingDouble(Student::getAverageScore));
    }

    @Override
    public void displayAllStudents() {
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
