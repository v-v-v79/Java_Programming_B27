package replit.methods;

import java.util.Calendar;
import java.util.Scanner;

public class HotelBooking {
    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){
        // WRITE YOUR CODE BELOW:
        if(!isAvailable || year != 2018)
            return false;
         Calendar from = Calendar.getInstance();
         Calendar to = Calendar.getInstance();
         Calendar required = Calendar.getInstance();
         from.set(2018,1,7);
         to.set(2018,8,7);
         required.set(year, month, day);

        if(required.before(from) || required.after(to))
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(simpleRoomBook(in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));

    }
}
