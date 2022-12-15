package mentor_tasks;

import java.util.*;

public class SortLettersNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        double startTime = System.currentTimeMillis();
        System.out.println(sortLettersNums(str));
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
    public static String sortLettersNums(String str) {
        String sorted = "";
        String letters = "";
        String digits = "";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))) {
                letters += str.charAt(i) + "";
                if(i == str.length() - 1 || Character.isDigit(str.charAt(i + 1))){
                    char[] temp = letters.toCharArray();
                    Arrays.sort(temp);
                    sorted += String.valueOf(temp);;
                    letters = "";
                }
            } else {
                digits += str.charAt(i) + "";
                if(i == str.length() - 1 || Character.isLetter(str.charAt(i + 1))) {
                    char[] temp2 = digits.toCharArray();
                    Arrays.sort(temp2);
                    sorted += String.valueOf(temp2);
                    digits = "";
                }
            }
        }
        return sorted;
    }
}
