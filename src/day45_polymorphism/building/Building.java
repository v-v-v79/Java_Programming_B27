package day45_polymorphism.building;

public abstract class Building {

    String location;
    double price;

    public Building(String location, double price) {
        this.location = location;
        this.price = price;
    }

    public abstract void pay();

    @Override
    public String toString() {
        return "Building{" +
                "location='" + location + '\'' +
                ", price=" + price +
                '}';
    }
}
