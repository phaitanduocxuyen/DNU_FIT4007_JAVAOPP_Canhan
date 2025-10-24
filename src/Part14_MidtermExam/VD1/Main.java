package src.Part14_MidtermExam.VD1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Scanner sc = new Scanner(System.in);
        String file = "products.txt";

        manager.loadFromFile(file);

        while (true) {
            System.out.println("\n===== MENU QUẢN LÝ SẢN PHẨM =====");
            System.out.println("1. Thêm sản phẩm điện tử");
            System.out.println("2. Thêm sản phẩm quần áo");
            System.out.println("3. Hiển thị tất cả sản phẩm");
            System.out.println("4. Tìm sản phẩm theo ID");
            System.out.println("5. Xóa sản phẩm");
            System.out.println("6. Sắp xếp theo giá");
            System.out.println("7. Lưu danh sách ra file");
            System.out.println("8. Đọc danh sách từ file");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Tên: ");
                    String name = sc.nextLine();
                    System.out.print("Giá: ");
                    double price = sc.nextDouble();
                    System.out.print("Bảo hành (tháng): ");
                    int w = sc.nextInt();
                    manager.addProduct(new Electronic(id, name, price, w));
                }
                case 2 -> {
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Tên: ");
                    String name = sc.nextLine();
                    System.out.print("Giá: ");
                    double price = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Size: ");
                    String size = sc.nextLine();
                    manager.addProduct(new Clothing(id, name, price, size));
                }
                case 3 -> manager.displayAll();
                case 4 -> {
                    System.out.print("Nhập ID: ");
                    String id = sc.nextLine();
                    Product p = manager.findProduct(id);
                    System.out.println(p != null ? p : "Không tìm thấy sản phẩm!");
                }
                case 5 -> {
                    System.out.print("Nhập ID cần xóa: ");
                    String id = sc.nextLine();
                    manager.removeProduct(id);
                }
                case 6 -> manager.sortByPrice();
                case 7 -> manager.saveToFile(file);
                case 8 -> manager.loadFromFile(file);
                case 0 -> {
                    System.out.println("Kết thúc chương trình!");
                    return;
                }
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}

