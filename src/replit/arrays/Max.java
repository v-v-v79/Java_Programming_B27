package replit.arrays;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        // DO NOT TOUCH BELOW
        Scanner input = new Scanner(System.in);
            int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //WRITE YOUR CODE BELOW
        int max = 0;
        for(int h: nums) {
            if(nums[h] > max)
                max = nums[h];
        }
             System.out.println(max);
    }
}
