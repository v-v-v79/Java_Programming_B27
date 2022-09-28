package day44_polymorphism.street;

public interface Driveable {
    default void driveable() {
        System.out.println("It's drivable");
    }

    boolean hasTrafficLights();
}
