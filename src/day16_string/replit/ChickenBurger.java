package day16_string.replit;

import java.util.Scanner;

public class ChickenBurger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String order = s.next();

        if (order.equalsIgnoreCase("burger"))
            System.out.println("Your total is $12.50");
        else if (order.equalsIgnoreCase("chicken"))
            System.out.println("Your total is $9.75");
    }
}