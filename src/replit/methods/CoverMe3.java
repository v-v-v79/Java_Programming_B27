package replit.methods;

import java.util.Scanner;

public class CoverMe3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(coverString(in.nextLine(), in.nextLine()));
    }

    public static String coverString(String main, String coverMe) {

        if (main.contains(coverMe))
            return main.replaceAll(coverMe, "[" + coverMe + "]");
        else
            return "[" + main + "]";
    }
}
