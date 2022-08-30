package day16_string.replit;

import java.util.Scanner;

public class StringReplace {
    public static void main(String[] args) {
//        String str = "abc abc abc";
//        str = str.replaceFirst("abc", "cba");
//        System.out.println(str);

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
//        String word2 = word.replace(word.charAt(0), ' ');
//        String word3 = word.replace(word.charAt(word.length() -1), ' ');
//
//        System.out.println("without first letter: " + word2.trim());
//        System.out.println("without last letter: " + word3.trim());

        System.out.println(word.substring(0, word.length()-1));
        System.out.println(word.substring(1));
        System.out.println(word.length()-1);
        System.out.println(word.indexOf('b'));


    }
}
