package src.Part11_Inheritance_OOP.VD3;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("Nhập thông tin sinh viên:");
        s.input();

        System.out.println("\nThông tin sinh viên:");
        System.out.println(s);

        System.out.println("Sinh viên đủ 18 tuổi: " + s.checkAge(18));
        System.out.println("Tên in hoa: " + s.getUpperName());
        System.out.println("Mã sinh viên bắt đầu bằng 23IT: " + s.checkStudentId());
    }
}
