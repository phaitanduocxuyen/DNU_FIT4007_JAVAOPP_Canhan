package src.Part12_Polymorphism_OOP.VD1;
import java.util.*;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public ArrayList<Student> getStudents() { return students; }

    public void addStudent(Student s) {
        for (Student st : students)
            if (st.equals(s)) return;
        students.add(s);
    }

    public void addStudent(ArrayList<Student> list) {
        for (Student s : list) addStudent(s);
    }

    public void showStudents() {
        for (Student s : students) System.out.println(s);
    }

    public void deleteStudent(String studentID) {
        students.removeIf(s -> s.getStudentID().equalsIgnoreCase(studentID));
    }

    public void updateStudent(String studentID, Student s) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentID().equalsIgnoreCase(studentID)) {
                students.set(i, s);
                return;
            }
        }
    }

    public Student searchStudent(String studentID) {
        for (Student s : students)
            if (s.getStudentID().equalsIgnoreCase(studentID)) return s;
        return null;
    }

    public void sortByScore() {
        students.sort(Comparator.comparingDouble(o -> {
            if (o instanceof StudentIT) return ((StudentIT) o).calculateAverage();
            else if (o instanceof StudentBA) return ((StudentBA) o).calculateAverage();
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
