package day16_string.replit;

import java.util.Scanner;

public class XofTheString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int lastIndex = word.length() - 1;
        boolean has_Fx = word.indexOf('x') == 0;
        boolean has_Lx = word.lastIndexOf('x') == lastIndex;
        boolean has_2x = word.indexOf('x') == 0 && word.lastIndexOf('x') == lastIndex;
        boolean has_fX = word.indexOf('X') == 0;
        boolean has_lX = word.lastIndexOf('X') == lastIndex;
        boolean has_2X = word.indexOf('X') == 0 && word.lastIndexOf('X') == lastIndex;
        boolean has_xX = word.indexOf('x') == 0 && word.lastIndexOf('X') == lastIndex;
        boolean has_Xx = word.indexOf('X') == 0 && word.lastIndexOf('x') == lastIndex;

        if (word.contains("x") || word.contains("X")) {
            if (has_2x || has_2X || has_Xx || has_xX)
                System.out.println(word.substring(1, lastIndex));
            else if (has_Lx || has_lX)
                System.out.println(word.substring(0, lastIndex));
            else if (has_Fx || has_fX)
                System.out.println(word.substring(1));
        }
        else
            System.out.println(word);
    }
}
