package src.Part13_Abstract_OPP.VD3;

public class Main {
    public static void main(String[] args) {
        IManager manager = new StudentManager();

        Student s1 = new StudentIT("23IT01", "An", 20, 8, 9);
        Student s2 = new StudentBA("23BA01", "Bình", 21, 7, 8);
        Student s3 = new StudentIT("23IT02", "Cường", 19, 9, 9);

        manager.addStudent(s1);
        manager.addStudent(s2);
        manager.addStudent(s3);

        System.out.println("== DANH SÁCH SINH VIÊN ==");
        manager.displayAllStudents();

        System.out.println("\n== SẮP XẾP THEO ĐIỂM TRUNG BÌNH ==");
        manager.sortByScore();
        manager.displayAllStudents();

        System.out.println("\n== SẮP XẾP THEO TUỔI ==");
        manager.sortByAge();
        manager.displayAllStudents();
    }
}
