package leetcode.rotatearray;

import java.util.Arrays;

public class Solution3 {
    public static void rotate(int[] nums, int k) {

        int n = nums.length;
        if (n == 0)
            return;
        int h = 0;
        int j = k;
        for (int i = 0; i < k; i++) {
            h = nums[i];
            nums[i] = nums[j];
            nums[j] = h;
            j++;
        }
        for (int i = 0; i < k; i++) {
            h = nums[i];
            nums[i] = nums[j];
            nums[j] = h;
            j++;
        }
        System.out.println(Arrays.toString(nums));
    }


    public static void main(String[] args) {
        rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }
}
