package replit.methods;

import java.util.Scanner;

public class WaterCost {
    public static double waterTax(double units) {
        //WRITE YOUR CODE BELOW:
        double cost = 0;
        if (units <= 50)
            cost = units * 0.60;
        else if (units > 50 && units <= 100)
            cost = units * 0.90;
        else if (units > 100 && units <= 150)
            cost = units * 0.90 + 50.0;
        else if (units > 150)
            cost = units * 0.90 + 100.0;
        return cost;
    }//end waterTax

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(waterTax(in.nextDouble()));
    }
}


