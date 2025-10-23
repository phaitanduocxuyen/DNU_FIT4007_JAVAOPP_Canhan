package src.Part14_MidtermExam.VD1;

import java.io.Serializable;

public abstract class Product implements Serializable {
    protected String id;
    protected String name;
    protected double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
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

    public abstract double getDiscountedPrice();

    @Override
    public String toString() {
        return id + " - " + name + " - Giá: " + price + " - Sau giảm: " + getDiscountedPrice();
    }
}

