package src.Part8_Constructor_OOP;

public class VD9_Player {
    private String name;
    private int age;
    private int positionX;
    private int positionY;

    public VD9_Player() {
    }

    public VD9_Player(String name, int age, int positionX, int positionY) {
        this.name = name;
        this.age = age;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    @Override
    public String toString() {
        return "VD9_Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", positionX=" + positionX +
                ", positionY=" + positionY +
                '}';
    }
}
