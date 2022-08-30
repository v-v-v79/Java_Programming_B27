 package day16_string.replit;

import java.util.Scanner;

public class MergeWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        if (word1.length() != 3 || word2.length() != 3)
            System.out.println("cannot merge");
        else {
            for (int i = 0; i < 3; i++)
                System.out.print(word1.charAt(i) + "" + word2.charAt(i));
        }
    }
}