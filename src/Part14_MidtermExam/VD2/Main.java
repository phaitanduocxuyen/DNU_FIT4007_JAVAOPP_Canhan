package src.Part14_MidtermExam.VD2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Scanner sc = new Scanner(System.in);
        String file = "products2.txt";

        manager.loadFromFile(file);

        while (true) {
            System.out.println("\n===== MENU QUẢN LÝ SẢN PHẨM NÂNG CAO =====");
            System.out.println("1. Thêm sản phẩm điện tử");
            System.out.println("2. Thêm sản phẩm quần áo");
            System.out.println("3. Hiển thị tất cả sản phẩm");
            System.out.println("4. Tìm sản phẩm theo ID");
            System.out.println("5. Tìm sản phẩm theo khoảng giá");
            System.out.println("6. Xóa sản phẩm");
            System.out.println("7. Sắp xếp theo giá");
            System.out.println("8. Sắp xếp theo tên");
            System.out.println("9. Tính tổng giá trị hàng tồn");
            System.out.println("10. Lưu ra file");
            System.out.println("11. Đọc từ file");
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
                    System.out.print("Số lượng: ");
                    int qty = sc.nextInt();
                    System.out.print("Bảo hành (tháng): ");
                    int w = sc.nextInt();
                    manager.addProduct(new Electronic(id, name, price, qty, w));
                }
                case 2 -> {
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Tên: ");
                    String name = sc.nextLine();
                    System.out.print("Giá: ");
                    double price = sc.nextDouble();
                    System.out.print("Số lượng: ");
                    int qty = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Size: ");
                    String size = sc.nextLine();
                    manager.addProduct(new Clothing(id, name, price, qty, size));
                }
                case 3 -> manager.displayAll();
                case 4 -> {
                    System.out.print("Nhập ID: ");
                    String id = sc.nextLine();
                    Product p = manager.findProduct(id);
                    System.out.println(p != null ? p : "Không tìm thấy sản phẩm!");
                }
                case 5 -> {
                    System.out.print("Giá tối thiểu: ");
                    double min = sc.nextDouble();
                    System.out.print("Giá tối đa: ");
                    double max = sc.nextDouble();
                    var list = manager.findByPriceRange(min, max);
                    if (list.isEmpty())
                        System.out.println("Không có sản phẩm trong khoảng giá!");
                    else
                        list.forEach(System.out::println);
                }
                case 6 -> {
                    System.out.print("Nhập ID cần xóa: ");
                    String id = sc.nextLine();
                    manager.removeProduct(id);
                }
                case 7 -> manager.sortByPrice();
                case 8 -> manager.sortByName();
                case 9 -> System.out.println("Tổng giá trị hàng tồn: " + manager.calculateTotalValue());
                case 10 -> manager.saveToFile(file);
                case 11 -> manager.loadFromFile(file);
                case 0 -> {
                    System.out.println("Kết thúc chương trình!");
                    return;
                }
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}

