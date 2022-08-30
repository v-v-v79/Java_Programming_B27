 package day16_string.replit;

import java.util.Scanner;

 public class LastIndexOf {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         String str = scan.next();

         int index2 = str.lastIndexOf("bread");

         System.out.println(index2);
     }
 }