package replit.loops;

import java.util.Scanner;

public class Zombie {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES:
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();

        int day = 0;
        for (int i = inhabitants; i >= 1; i /= 2) {
            System.out.println("Day " + day + " [" + i + "]");
            day++;
            if (i == 1)
                break;
        }
        System.out.println("---- EXTINCT ----");
    }
}

