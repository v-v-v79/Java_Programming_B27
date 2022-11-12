package mentor_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseNegativeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int negNum = scanner.nextInt();
        System.out.println(reverseNegNum(negNum));
    }

    public static int reverseNegNum(int negNum) {
        if (negNum >= 0)
            return 1;
        char[] arr = (negNum + "").toCharArray();
        int i = 1;
        for (int j = arr.length - 1; j > i; j--) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
        return Integer.parseInt(String.valueOf(arr));
    }
}
