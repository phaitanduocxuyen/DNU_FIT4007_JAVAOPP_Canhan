package src.Part12_Polymorphism_OOP.VD4;
import java.util.*;

public class StudentManager {
    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public StudentManager(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() { return students; }
    public void setStudents(ArrayList<Student> students) { this.students = students; }

    public void addStudent(Student s) {
        if (!students.contains(s))
            students.add(s);
    }

    public void addStudent(ArrayList<Student> list) {
        for (Student s : list) addStudent(s);
    }

    public void showStudents() {
        if (students.isEmpty()) System.out.println("Danh sách trống.");
        else for (Student s : students) System.out.println(s);
    }

    public void deleteStudent(String studentID) {
        students.removeIf(s -> s.getStudentID().equalsIgnoreCase(studentID));
    }

    public void updateStudent(String studentID, Student sNew) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentID().equalsIgnoreCase(studentID)) {
                students.set(i, sNew);
                return;
            }
        }
    }

    public Student searchStudent(String studentID) {
        for (Student s : students) {
            if (s.getStudentID().equalsIgnoreCase(studentID))
                return s;
        }
        return null;
    }

    public void sortByScore() {
        students.sort(Comparator.comparingDouble(s -> {
            if (s instanceof StudentIT)
                return ((StudentIT) s).calculateAverage();
            else if (s instanceof StudentBA)
                return ((StudentBA) s).calculateAverage();
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
