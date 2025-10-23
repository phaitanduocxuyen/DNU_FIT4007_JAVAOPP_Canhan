package src.Part8_Constructor;

public class VD7_Car {
    private String color;
    private String name;
    private int seatingCapacity;
    private int year;

    public VD7_Car() {
    }

    public VD7_Car(String color, String name, int seatingCapacity, int year) {
        this.color = color;
        this.name = name;
        this.seatingCapacity = seatingCapacity;
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "VD7_Car{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", seatingCapacity=" + seatingCapacity +
                ", year=" + year +
                '}';
    }
}
