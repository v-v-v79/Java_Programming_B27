package mentor_tasks;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        double startTime = System.currentTimeMillis();
        //System.out.println("startTime = " + startTime);
        System.out.println(stringReverse(str));
        //System.out.println(stringReverse2(str));
        double stopTime = System.currentTimeMillis();
        //System.out.println("stopTime = " + stopTime);
        double elapsedTime = stopTime - startTime;
        System.out.printf("%.10f\n", elapsedTime);
        Runtime runtime = Runtime.getRuntime();
        // Run the garbage collector
        runtime.gc();
        // Calculate the used memory
        long memory = runtime.totalMemory() - runtime.freeMemory();
        //System.out.println("Used memory is bytes: " + memory);
        System.out.println("Used memory is megabytes: "
                + bytesToMegabytes(memory));
    }

    public static String stringReverse(String str) {
        char[] arr = str.toCharArray();
        int j = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] = (char) (arr[i] + arr[j]);
            arr[j] = (char) (arr[i] - arr[j]);
            arr[i] = (char) (arr[i] - arr[j]);
            j--;
        }
        return String.valueOf(arr);
    }

    public static String stringReverse2(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i) + "";
        }
        return reversed;
    }

    public static double bytesToMegabytes(double bytes) {
        long MEGABYTE = 1024L * 1024L;
        return bytes / MEGABYTE;
    }
}


