package day37_static;

public class Computer {

    Double price;
    String brand;
    String color;
    public static boolean hasScreen;
    public static boolean hasBattery;
    public static boolean hasMemory;

    static {
        hasScreen = true;
        hasBattery = true;
        hasMemory = true;
    }

    public Computer(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public Computer(Double price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    public Computer(Double price, String brand, String color) {
        this.price = price;
        this.brand = brand;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
