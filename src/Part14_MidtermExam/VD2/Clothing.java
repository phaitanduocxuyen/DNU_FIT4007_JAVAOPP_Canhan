package src.Part14_MidtermExam.VD2;

public class Clothing extends Product {
    private String size;

    public Clothing(String id, String name, double price, int quantity, String size) {
        super(id, name, price, quantity);
        this.size = size;
    }

    @Override
    public double getDiscountedPrice() {
        return (size.equalsIgnoreCase("L") || size.equalsIgnoreCase("XL")) ? price * 0.85 : price;
    }

    @Override
    public String toString() {
        return "[Clothing] " + super.toString() + " - Size: " + size;
    }
}
