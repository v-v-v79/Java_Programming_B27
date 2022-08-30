package day19_loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int i = num;
        int factorial = num;
        while (--i > 0) {
            factorial = factorial * --num;
        }
        System.out.println(factorial);
    }
}
