package replit.loops;

import java.util.Scanner;

public class TriplesTimes {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int i;
        int counter = 0;
        int endOfStr = str.length() - 1;
        char triple1;
        char triple2;
        char triple3;

        for (i = 0; i < str.length(); i++){
            triple1 = str.charAt(i);
            System.out.println(i);
            System.out.println(str.indexOf(triple1, i));
           if (i + 2 > endOfStr)
               break;
           else {
               triple2 = str.charAt(i + 1);
               triple3 = str.charAt(i + 2);
               if (triple1 == triple2 && triple1 == triple3)
                   counter++;
           }
        }
        System.out.println(counter);
    }
}
