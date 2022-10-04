package mentor_tasks;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num");
        int num = scanner.nextInt();
        System.out.println(oddEven(num));
    }
    public static String oddEven(int num) {
        if(num == 0)
            return "Zero";
        return num % 2 == 0 ? "Even" : "Odd";
    }
}
