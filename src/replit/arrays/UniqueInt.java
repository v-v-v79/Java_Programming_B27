package replit.arrays;

import java.util.Scanner;

public class UniqueInt {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt()};

        //WRITE YOUR CODE BELOW:
        for (int i = 0; i < nums.length; i++) {
            int k = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    k++;
            }
            if (k == 1) {
                System.out.println(nums[i]);
                break;
            }
        }
    }
}