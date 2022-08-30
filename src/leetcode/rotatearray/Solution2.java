package leetcode.rotatearray;

import java.util.Arrays;

public class Solution2 {
    public static void rotate(int[] nums, int k) {

        int n = nums.length;
        if (n == 0)
            return;
        int h = 0;
        for (int i = 0; i < k; i++) {
            for (int j = n - 1; j > 0; j--) {
                h = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = h;
            }
        }
        System.out.println(Arrays.toString(nums));
    }


    public static void main(String[] args) {
        rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }
}
