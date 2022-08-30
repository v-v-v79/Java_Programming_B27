package day39_encaps_recap;

public class Pizza {

    private String size;
    private int numberOfToppings;


    public Pizza(String size, int numberOfToppings) {
        setSize(size);
        setNumberOfToppings(numberOfToppings);
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        if(size.equals("medium") || size.equals("large") || size.equals("small"))
            this.size = size;
    }
    public int getNumberOfToppings() {
        return numberOfToppings;
    }
    public void setNumberOfToppings(int numberOfToppings){
        if (numberOfToppings > 0)
            this.numberOfToppings = numberOfToppings;
    }
    public double calculatePrice(String size, int numberOfToppings) {
        return (size.equals("small") ? 4 : size.equals("medium") ? 6 : 8) + numberOfToppings * 0.75;
    }
}
