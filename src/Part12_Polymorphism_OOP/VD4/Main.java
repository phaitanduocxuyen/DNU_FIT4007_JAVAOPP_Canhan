package src.Part12_Polymorphism_OOP.VD4;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        StudentIT s1 = new StudentIT("IT001", "An", 20, 8, 9);
        StudentBA s2 = new StudentBA("BA001", "Bình", 21, 7, 8);
        StudentIT s3 = new StudentIT("IT002", "Cường", 19, 9, 9);

        manager.addStudent(s1);
        manager.addStudent(s2);
        manager.addStudent(s3);

        System.out.println("== Danh sách sinh viên ==");
        manager.showStudents();

        System.out.println("\n== Sắp xếp theo điểm ==");
        manager.sortByScore();
        manager.showStudents();

        System.out.println("\n== Sắp xếp theo ngành ==");
        manager.sortByType();
        manager.showStudents();
    }
}
