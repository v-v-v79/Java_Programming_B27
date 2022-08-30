package day16_string.replit;

import java.util.Scanner;

public class AhalfOfTheString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        System.out.print(word.substring(0, word.length()/2));
        System.out.println(word.substring(0, word.length()/2));
    }
}
