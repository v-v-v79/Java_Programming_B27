package day16_string.replit;

import java.util.Scanner;

public class JavaPosition {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.toUpperCase().contains("JAVA")) {
            if (word.toUpperCase().startsWith("JAVA"))
                System.out.println(exists = true);
            else if (word.toUpperCase().substring(1).startsWith("JAVA"))
                System.out.println(exists = true);
        } else
            System.out.println(exists);
    }
}