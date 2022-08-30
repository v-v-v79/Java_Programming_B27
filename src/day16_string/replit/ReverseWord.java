 package day16_string.replit;

import java.util.Scanner;

 public class ReverseWord {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         String word = scan.next();

         if (word.length() > 5)
             System.out.println("Too long!");
         else if (word.length() < 5)
             System.out.println("Too short!");
         else {
             for (int i = 4; i >= 0; i--)
                 System.out.print(word.charAt(i));
         }
     }
 }