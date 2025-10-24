package src.Part14_MidtermExam.VD1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductManager implements IProductManager {
    private ArrayList<Product> products = new ArrayList<>();

    @Override
    public void addProduct(Product p) {
        products.add(p);
        System.out.println("Đã thêm sản phẩm: " + p.getName());
    }

    @Override
    public void removeProduct(String id) {
        boolean removed = products.removeIf(p -> p.getId().equals(id));
        if (removed)
            System.out.println("Đã xóa sản phẩm có ID: " + id);
        else
            System.out.println("Không tìm thấy sản phẩm!");
    }

    @Override
    public Product findProduct(String id) {
        for (Product p : products) {
            if (p.getId().equals(id)) return p;
        }
        return null;
    }

    @Override
    public void displayAll() {
        if (products.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }
        products.forEach(System.out::println);
    }

    @Override
    public void sortByPrice() {
        Collections.sort(products, Comparator.comparingDouble(Product::getPrice));
        System.out.println("Đã sắp xếp theo giá tăng dần!");
    }

    @Override
    public void saveToFile(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(products);
            System.out.println("Đã lưu danh sách vào file " + filename);
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public void loadFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            products = (ArrayList<Product>) ois.readObject();
            System.out.println("Đã đọc dữ liệu từ file " + filename);
        } catch (FileNotFoundException e) {
            System.out.println("Chưa có file dữ liệu!");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}

