package src.Part14_MidtermExam.VD3;

import java.util.ArrayList;

public interface IManager {
    void addStudent(Student student);
    void editStudent(String masv, Student student);
    void removeStudent(String masv);
    Student findStudent(String masv);
    ArrayList<Student> findStudent(int age);
    void sortByAge();
    void sortByScore();
    void displayAllStudents();
}
