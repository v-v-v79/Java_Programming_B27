package day36_custom_classes.food;

import java.util.Arrays;

public class FoodMart {
    public static void main(String[] args) {
        Food fruit = new Food("apple", 40, 0.5);
        Food fruit1 = new Food("apricot", 30, 0.3);
        Food fruit2 = new Food("perch", 25, 1.0);
        Food fruit3 = new Food("watermelon", 8, 3);

        Food[] cart = new Food[4];
        cart[0] = fruit;
        cart[1] = fruit1;
        cart[2] = fruit2;
        cart[3] = fruit3;

        for (Food each: cart) {
            if (each.name.startsWith("a"))
                System.out.println("Starts with 'a':" + each);
        }
        double max = 0;
        String more = "";
        double total_price = 0;
        for (Food each: cart) {
            total_price = Food.calculatePrice(each.quantity, each.unit_price);
            if( total_price > max){
                max = total_price;
                more = each.name;
            }
        }
        System.out.println(more + " $" + max);
    }
}
