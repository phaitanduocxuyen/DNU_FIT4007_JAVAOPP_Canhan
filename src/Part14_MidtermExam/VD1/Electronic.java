package src.Part14_MidtermExam.VD1;

public class Electronic extends Product {
    private int warrantyMonths;

    public Electronic(String id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public double getDiscountedPrice() {
        if (warrantyMonths > 12) {
            return price * 0.9;
        }
        return price;
    }

    @Override
    public String toString() {
        return "[Electronic] " + super.toString() + " - Bảo hành: " + warrantyMonths + " tháng";
    }
}

