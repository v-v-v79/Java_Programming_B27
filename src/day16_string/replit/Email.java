 package day16_string.replit;

import java.util.Locale;
import java.util.Scanner;

 public class Email {
     public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         String email = s.nextLine();

         String name = "ALEJANDRO";
         String project = "PROJECT";
         boolean hasName = email.toUpperCase().contains(name);
         boolean hasProject = email.toUpperCase().contains(project);
         if(!hasName)
             System.out.println("don't read");
         else if (hasName && !hasProject)
             System.out.println("read");
         else if (hasName && hasProject)
             System.out.println("priority");
     }
 }