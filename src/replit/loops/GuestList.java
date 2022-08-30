package replit.loops;

import java.util.ArrayList;
import java.util.Scanner;

public class GuestList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String guestName = "";
        String yes;
        ArrayList guestList = new ArrayList();
        boolean nextGuest = true;

        while (nextGuest) {
            System.out.println("Please enter the guest's name:");
            guestName = input.nextLine();
            guestList.add(guestName);
            System.out.println("Do you want to enter another guest's name?");
            yes = input.nextLine();
            nextGuest = yes.equalsIgnoreCase("YES");
        }
        String guestListStr = guestList.toString().replace("[", "");
        guestListStr = guestListStr.replace("]", "");
        System.out.println("Guests' list: " + guestListStr);
    }
}
