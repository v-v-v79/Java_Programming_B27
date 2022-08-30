 package day16_string.replit;

import java.util.Scanner;

 public class Sandwich {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         String str = scan.next();

         int index1 = str.toUpperCase().indexOf("BREAD") + 5;
         int index2 = str.toUpperCase().lastIndexOf("BREAD");
         if(!str.toUpperCase().substring(index1).contains("BREAD"))
             System.out.println("nothing");
         else
             System.out.println(str.substring(index1, index2));
         System.out.println(index2);
     }
 }