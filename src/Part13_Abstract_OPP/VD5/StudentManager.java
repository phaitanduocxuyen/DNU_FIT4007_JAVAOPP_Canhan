package src.Part13_Abstract_OPP.VD5;

import java.io.*;
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
                System.out.println(" Đã cập nhật sinh viên " + masv);
                return;
            }
        }
        System.out.println(" Không tìm thấy sinh viên có mã " + masv);
    }

    @Override
    public void removeStudent(String masv) {
        boolean removed = students.removeIf(s -> s.getMasv().equals(masv));
        if (removed)
            System.out.println(" Đã xóa sinh viên " + masv);
        else
            System.out.println(" Không tìm thấy sinh viên!");
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
        if (students.isEmpty()) {
            System.out.println("Danh sách sinh viên trống!");
            return;
        }
        students.forEach(System.out::println);
    }

    @Override
    public void saveToFile(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(students);
            System.out.println(" Đã lưu danh sách sinh viên vào file " + filename);
        } catch (IOException e) {
            System.out.println(" Lỗi khi ghi file: " + e.getMessage());
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public void loadFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            students = (ArrayList<Student>) ois.readObject();
            System.out.println(" Đã đọc danh sách sinh viên từ file " + filename);
        } catch (FileNotFoundException e) {
            System.out.println(" Chưa có file lưu trước đó!");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(" Lỗi khi đọc file: " + e.getMessage());
        }
    }
}
