package src.Part14_MidtermExam.VD2;

import java.io.Serializable;

public abstract class Product implements Serializable {
    protected String id;
    protected String name;
    protected double price;
    protected int quantity;

    public Product(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalValue() {
        return getDiscountedPrice() * quantity;
    }

    public abstract double getDiscountedPrice();

    @Override
    public String toString() {
        return id + " - " + name + " - Giá: " + price +
                " - Số lượng: " + quantity + " - Sau giảm: " + getDiscountedPrice() +
                " - Tổng: " + getTotalValue();
    }
}

