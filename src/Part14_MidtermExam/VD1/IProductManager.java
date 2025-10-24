package src.Part14_MidtermExam.VD1;

public interface IProductManager {
    void addProduct(Product p);
    void removeProduct(String id);
    Product findProduct(String id);
    void displayAll();
    void sortByPrice();
    void saveToFile(String filename);
    void loadFromFile(String filename);
}
