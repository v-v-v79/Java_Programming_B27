package mentor_tasks;

import day30_wrapper_class.ParseInt;

import java.util.Scanner;

public class StringSumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        double startTime = System.currentTimeMillis();
        System.out.println(sumOfDigits(str));
        double stopTime = System.currentTimeMillis();
        double elapsedTime = stopTime - startTime;
        System.out.printf("Runtime ms: %.10f\n", elapsedTime);
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        double memory = runtime.totalMemory() - runtime.freeMemory();
        //System.out.println("Used memory is bytes: " + memory);
        System.out.println("Used memory Mb: "
                + memory/(1024 * 1024));
    }

    public static int sumOfDigits(String str) {
        int res = 0;
        char[] arr = str.toCharArray();
        for (char c : arr) {
            if(Character.isDigit(c)) {
                res += Integer.parseInt(c + "");
            }
        }
        return res;
    }
}
