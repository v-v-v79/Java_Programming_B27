package mentor_tasks;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(isPrime(num));
    }
    public static boolean isPrime(int num){
        if(num == 1)
            return false;
        if (num == 2 || num == 3)
            return true;
        return num % 2 != 0 && num % 3 != 0;
    }
}
