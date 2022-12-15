package mentor_tasks;

import java.util.HashSet;
import java.util.Scanner;

public class PasswordAuth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        double startTime = System.currentTimeMillis();
        System.out.println(passwordAuth(str));
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

    //&8*donjeta123
    public static boolean passwordAuth(String str) {
        if (str.length() < 6 || str.contains(" "))
            return false;
        char[] arr = str.toCharArray();
        int counter = 0;
        for (char c : arr) {
            if (isUpper(c)) {
                counter++;
                break;
            }
        }
        if(counter < 1)
            return false;
        for (char c : arr) {
            if (isLower(c)) {
                counter++;
                break;
            }
        }
        if(counter < 2)
            return false;
        for (char c : arr) {
            if (isNum(c)) {
                counter++;
                break;
            }
        }
        if(counter < 3)
            return false;
        for (char c : arr) {
            if (isSpecial(c)) {
                counter++;
                break;
            }
        }
        return counter >= 4;
    }

    public static boolean isUpper(char c) {
        return "ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(c) >= 0;
    }
    public static boolean isLower(char c) {
        return "abcdefghijklmnopqrstuvwxyz".indexOf(c) >= 0;
    }
    public static boolean isNum(char c) {
        return "1234567890".indexOf(c) >= 0;
    }
    public static boolean isSpecial(char c) {
        return "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~".indexOf(c) >= 0;
    }
}
