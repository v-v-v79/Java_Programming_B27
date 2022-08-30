package day36_custom_classes.food;

public class Food {

    String name;
    int quantity;
    double unit_price;
    double total_price;

    public Food(){

    }
    public Food(String name) {
        this.name = name;

    }public Food(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;

    }public Food(String name, int quantity, double unit_price) {
        this.name = name;
        this.quantity = quantity;
        this.unit_price = unit_price;
    }
    public static double calculatePrice(int quantity, double unit_price) {
        return quantity * unit_price;
    }
    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", unit_price=" + unit_price +
                ", total_price=" + total_price +
                '}';
    }
}
