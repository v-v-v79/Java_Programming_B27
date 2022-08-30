package replit.custom_classes;

public class Iem {
    String name;
    double price;

    public Iem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " - " + price;
    }
}
