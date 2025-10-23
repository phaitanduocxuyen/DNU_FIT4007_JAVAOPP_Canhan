package src.Part12_Polymorphism_OOP.VD5;
import java.util.*;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void showStudents() {
        if (students.isEmpty())
            System.out.println("Danh sách trống.");
        else
            for (Student s : students) System.out.println(s);
    }

    public Student searchStudent(String id) {
        for (Student s : students)
            if (s.getStudentID().equalsIgnoreCase(id)) return s;
        return null;
    }

    public void deleteStudent(String id) {
        students.removeIf(s -> s.getStudentID().equalsIgnoreCase(id));
    }

    public void updateStudent(String id, Student newS) {
        for (int i = 0; i < students.size(); i++)
            if (students.get(i).getStudentID().equalsIgnoreCase(id))
                students.set(i, newS);
    }

    public void sortByScore() {
        students.sort(Comparator.comparingDouble(s -> {
            if (s instanceof StudentIT) return ((StudentIT) s).calculateAverage();
            if (s instanceof StudentBA) return ((StudentBA) s).calculateAverage();
            return 0;
        }));
    }

    public void sortByAge() {
        students.sort(Comparator.comparingInt(Student::getAge));
    }

    public void sortByID() {
        students.sort(Comparator.comparing(Student::getStudentID));
    }

    public void sortByType() {
        students.sort((a, b) -> {
            if (a instanceof StudentIT && b instanceof StudentBA) return -1;
            if (a instanceof StudentBA && b instanceof StudentIT) return 1;
            return 0;
        });
    }
}
