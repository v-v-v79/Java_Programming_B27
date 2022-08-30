 package day16_string.replit;

import java.util.Scanner;

 public class Prefix {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         String str = scan.next();
         int n = scan.nextInt();

         String prefix = str.substring(0, n);
         String afterPrefix = str.substring(n);
         boolean hasPrefix = afterPrefix.contains(prefix);

         if(hasPrefix)
             System.out.println("true");
         else
             System.out.println("false");
     }
 }