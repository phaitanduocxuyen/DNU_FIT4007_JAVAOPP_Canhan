package src.Part9_Method_OOP;

public class VD6_Animal {
    private String name;
    private String color;
    private int age;

    public VD6_Animal() {}

    public VD6_Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearOfBirth() {
        return java.time.Year.now().getValue() - age;
    }

    public boolean equalsColor(VD6_Animal a) {
        return this.color.equalsIgnoreCase(a.color);
    }

    public void increaseAge() {
        age++;
    }

    @Override
    public String toString() {
        return "Animal{" + "name='" + name + '\'' + ", color='" + color + '\'' + ", age=" + age + '}';
    }
}
