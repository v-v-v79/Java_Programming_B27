package day43_abstraction.interface1;

public interface Mac {
    public static final String brand = "Apple"; //gray because it's by default
    String os = "IOS";

    public abstract void turnOn();
    public static void getBrand(){
        System.out.println("The brand is Apple");
    }
    public default void typing() {
        System.out.println(os);
        System.out.println(brand);
        System.out.println("Start typing");
    }
}
