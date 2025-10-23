package src.Part11_Inheritance_OOP.VD1;
import java.util.Scanner;

public class Laptop extends ElectronicDevice {
    private String screenSize;

    public Laptop() {}

    public Laptop(String manufacturer, long price, String screenSize) {
        super(manufacturer, price);
        this.screenSize = screenSize;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Kích thước màn hình: ");
        screenSize = sc.nextLine();
    }

    public String toString() {
        return super.toString() + ", ScreenSize: " + screenSize;
    }
}
