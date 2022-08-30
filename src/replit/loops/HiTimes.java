package replit.loops;

import java.util.Scanner;

public class HiTimes {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        boolean hasHi;
        int i = 0;

        while (true) {
            hasHi = str.contains("hi");
            if(hasHi) {
                i++;
                str = str.substring(str.indexOf("hi") + 2);
            }
            else
                break;
        }
        System.out.println(i);
    }
}
