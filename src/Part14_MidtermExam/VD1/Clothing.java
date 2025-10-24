package src.Part14_MidtermExam.VD1;

public class Clothing extends Product {
    private String size;

    public Clothing(String id, String name, double price, String size) {
        super(id, name, price);
        this.size = size;
    }

    @Override
    public double getDiscountedPrice() {
        if (size.equalsIgnoreCase("L") || size.equalsIgnoreCase("XL")) {
            return price * 0.85;
        }
        return price;
    }

    @Override
    public String toString() {
        return "[Clothing] " + super.toString() + " - Size: " + size;
    }
}

