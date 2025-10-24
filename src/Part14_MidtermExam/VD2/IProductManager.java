package src.Part14_MidtermExam.VD2;

import java.util.ArrayList;

public interface IProductManager {
    void addProduct(Product p);
    void removeProduct(String id);
    Product findProduct(String id);
    ArrayList<Product> findByPriceRange(double min, double max);
    void displayAll();
    void sortByPrice();
    void sortByName();
    double calculateTotalValue();
    void saveToFile(String filename);
    void loadFromFile(String filename);
}

