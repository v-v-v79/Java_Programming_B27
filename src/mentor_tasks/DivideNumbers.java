package mentor_tasks;

import java.util.Scanner;

public class DivideNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = scanner.nextInt();
        System.out.println("Enter num2");
        int num2 = scanner.nextInt();
        System.out.println("division(num1, num2) = " + division(num1, num2));
    }
    public static long division(int num1, int num2) {
        if(num2 == 0)
            return 1;
        int sign = num1 < 0 || num2 < 0 ? -1 : 1;
        int counter = 0;
        num1 *= num1 < 0 ? -1 : 1;
        num2 *= num2 < 0 ? -1 : 1;
        while (num1 >= num2) {
            num1 -= num2;
            counter++;
        }
        return counter * sign;
    }
}
