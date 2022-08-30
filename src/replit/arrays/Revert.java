package replit.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Revert {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINES:
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++){
            arr[i] = input.nextLine();
        }
        //WRITE YOUR CODES BELOW:
        int j = 0;
        String[] arr1  = new String[5];
        for(int i = 4; i >= 0; i--){
            arr1[j] = arr[i];
            j++;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Integer.MIN_VALUE);
    }
}
