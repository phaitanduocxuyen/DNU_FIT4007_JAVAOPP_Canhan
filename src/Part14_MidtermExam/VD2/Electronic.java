package src.Part14_MidtermExam.VD2;

public class Electronic extends Product {
    private int warrantyMonths;

    public Electronic(String id, String name, double price, int quantity, int warrantyMonths) {
        super(id, name, price, quantity);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public double getDiscountedPrice() {
        return warrantyMonths > 12 ? price * 0.9 : price;
    }

    @Override
    public String toString() {
        return "[Electronic] " + super.toString() + " - Bảo hành: " + warrantyMonths + " tháng";
    }
}
