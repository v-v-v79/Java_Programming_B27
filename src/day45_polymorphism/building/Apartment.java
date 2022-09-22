package day45_polymorphism.building;

public class Apartment extends Building implements HasBalcony {

    int numberOfMonths;

    public Apartment(String location, double price, int numberOfMonths) {
        super(location, price);
        this.numberOfMonths = numberOfMonths;
    }

    @Override
    public void pay() {
        System.out.println("Paying rent");
    }

    @Override
    public void openBalcony() {
        System.out.println("Opening balcony");
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "numberOfMonths=" + numberOfMonths +
                "} " + super.toString();
    }
}
