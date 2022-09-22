package day45_polymorphism.building;

public class House extends Building implements HasBackyard {

    int numberOfResidents;

    public House(String location, double price, int numberOfResidents) {
        super(location, price);
        this.numberOfResidents = numberOfResidents;
    }

    @Override
    public void pay() {
        System.out.println("Paying mortgage");
    }

    @Override
    public void mowLawn() {
        System.out.println("Moving lawn");
    }

    @Override
    public String toString() {
        return super.toString() + "number of residents" + numberOfResidents;
    }
}
