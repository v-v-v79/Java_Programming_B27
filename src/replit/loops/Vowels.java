package replit.loops;

import java.util.Scanner;

class Vowel {
    public static boolean vowel(char c) {
        return "aeiouAEIOU".indexOf(c) >= 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        boolean isVowel;
        for (int i = 0; i < word.length(); i++) {
            isVowel = vowel(word.charAt(i));
            if(isVowel)
                System.out.print(word.charAt(i));
        }
    }
}

