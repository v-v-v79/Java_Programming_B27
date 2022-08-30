package day37_static;

public class ComputerStore {
    public static void main(String[] args) {
        Computer mac = new Computer(3500.00, "Apple", "Gray");
        Sales sales = new Sales("James", "Apple", "Gray");
        Sales.says();
        Sales.offers();
        Sales.introduce();
        System.out.println("My name is " + sales.name);
        System.out.println("Here is " + sales.computer.brand);
        System.out.println("It has this beautiful " + sales.computer.color + " color");
        System.out.println("Is it " + mac + " ?");
        System.out.println("Yes it has 1Tb memory: " + Computer.hasMemory + "\n"
                + "it has 4K screen: " + Computer.hasScreen + "\n"
                + "it has battery: " + Computer.hasBattery);

    }
}
