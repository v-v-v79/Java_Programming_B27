package day09_ternary;

import java.util.Scanner;

public class MiddleNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Enter first number:");
        num1 = input.nextInt();
        System.out.println("Enter second number:");
        num2 = input.nextInt();
        System.out.println("Enter third number:");
        num3 = input.nextInt();

        if (num1 > num2 && num1 < num3)
            System.out.println("middle number is: " + num1);
        else if (num2 > num1 && num2 < num3)
            System.out.println("middle number is: " + num2);
        else
            System.out.println("middle number is: " + num3);

//        System.out.println(num1 > num2 && num1 < num3 ? "middle number is " + num1 :
//                num2 > num1 && num2 < num3 ? "middle number is " + num2 :
//                        "middle number is " + num3);
    }
}
