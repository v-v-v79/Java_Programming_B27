package day02_print_statements;

public class Pizza {
    public static void main(String[] args) {
        String cheesePizza = "Cheese";
        int pizzaSlices = 12;
        int numberOfPeople = 3;
        int slicesPerPerson = pizzaSlices / numberOfPeople;
        int leftOver = pizzaSlices % numberOfPeople;

        System.out.println(slicesPerPerson);
        System.out.println(leftOver);
    }
}
