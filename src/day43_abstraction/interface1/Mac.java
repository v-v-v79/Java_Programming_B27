package day43_abstraction.interface1;

public interface Mac {
    public static final String brand = "Apple";
    String os = "IOS";

    public abstract void turnOn();
    public static void getBrand(){
        System.out.println("The brand is Apple");
    }
    public default void typing() {
        System.out.println("Start typing");
    }
}
