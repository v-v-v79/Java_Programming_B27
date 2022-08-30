package replit.loops;

import java.util.Scanner;

public class SeparateLetters {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        char word1 [] = word.toCharArray();

        for (int i = 0; i < word1.length; i++)
            System.out.println(word1[i]);
    }
}
