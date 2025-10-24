package src.Part14_MidtermExam.VD2;

import java.io.*;
import java.util.*;

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
        System.out.println(removed ? "Đã xóa sản phẩm " + id : "Không tìm thấy sản phẩm!");
    }

    @Override
    public Product findProduct(String id) {
        for (Product p : products)
            if (p.getId().equals(id)) return p;
        return null;
    }

    @Override
    public ArrayList<Product> findByPriceRange(double min, double max) {
        ArrayList<Product> result = new ArrayList<>();
        for (Product p : products) {
            double discounted = p.getDiscountedPrice();
            if (discounted >= min && discounted <= max)
                result.add(p);
        }
        return result;
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
        products.sort(Comparator.comparingDouble(Product::getDiscountedPrice));
        System.out.println("Đã sắp xếp theo giá tăng dần!");
    }

    @Override
    public void sortByName() {
        products.sort(Comparator.comparing(Product::getName, String.CASE_INSENSITIVE_ORDER));
        System.out.println("Đã sắp xếp theo tên!");
    }

    @Override
    public double calculateTotalValue() {
        double total = 0;
        for (Product p : products) total += p.getTotalValue();
        return total;
    }

    @Override
    public void saveToFile(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(products);
            System.out.println("Đã lưu danh sách vào file " + filename);
        } catch (IOException e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
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
            System.out.println("Lỗi đọc file: " + e.getMessage());
        }
    }
}

