package day45_polymorphism.building;

public class OfficeBuilding extends Building implements HasElevator {

    int numberOfFloors;

    public OfficeBuilding(String location, double price, int numberOfFloors) {
        super(location, price);
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public void pay() {
        System.out.println("Paying bills");
    }

    @Override
    public void elevator() {
        System.out.println("Elevator is going up and down");
    }

    @Override
    public String toString() {
        return "OfficeBuilding{" +
                "numberOfFloors=" + numberOfFloors +
                "} " + super.toString();
    }
}
