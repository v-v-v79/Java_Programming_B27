 package day16_string.replit;

import java.util.Scanner;

 public class DivideEmail {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         String email = scan.next();

         String firstName = email.substring(0,email.indexOf('_'));
         String lastName = email.substring(email.indexOf('_') + 1,email.indexOf('@'));
         String domain = email.substring(email.indexOf('@') + 1,email.indexOf('.'));

         firstName = firstName.toUpperCase().charAt(0) + firstName.substring(1);
         lastName = lastName.toUpperCase().charAt(0) + lastName.substring(1);
         domain = domain.toUpperCase().charAt(0) + domain.substring(1);

         System.out.println("First name: " + firstName);
         System.out.println("Last name: " + lastName);
         System.out.println("Domain: " + domain);
     }
 }