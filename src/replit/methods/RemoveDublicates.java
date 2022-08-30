package replit.methods;

import java.util.Scanner;

public class RemoveDublicates {
    public static String uniqueChars(String str) {
        String original = "";

        for (int j = 0; j < str.length(); j++) {
            if (!original.contains("" + str.charAt(j))) {
                original += "" + str.charAt(j);
            }
        }
        return original;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));
    }
}
