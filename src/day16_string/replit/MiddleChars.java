 package day16_string.replit;

import java.util.Scanner;

 public class MiddleChars {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         String word = scan.next();

         boolean even = word.length() % 2 == 0;
         int middleChar = word.length() / 2;
         if(even)
             System.out.println(word.charAt(middleChar -1) +
                     "" + word.charAt(middleChar));
         else
             System.out.println(word.charAt(middleChar));
     }
 }