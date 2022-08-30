package replit.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraiMin {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //WRITE YOUR CODE BELOW
        String[] arr = str.split(", ");
        System.out.println(Arrays.toString(arr));
        String min = arr[arr.length - 1];
        for(int i = arr.length - 1; i > 0; i--){
            if(arr[i - 1].length() <= min.length())
                min = arr[i - 1];
        }
        int minLength = min.length();
        System.out.println(min);
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length() == minLength && !arr[i].equals(min))
                min += " " + arr[i];
        }
        String[] arrMin = min.split(" ");
        System.out.println(Arrays.toString(arrMin));
    }
}
