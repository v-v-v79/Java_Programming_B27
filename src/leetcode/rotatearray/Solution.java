package leetcode.rotatearray;

import java.util.Arrays;

public class Solution {
    public static void rotate(int[] nums, int k) {

        int n = nums.length;
        int[] arr = new int[n];
        if (n == 0 || n == 1)
            return;
        if(k == n) {
            nums = Arrays.copyOf(nums, n);
            return;
        }
        if(k > n)
            k %= n;
        int counter = 0;
        int firstIndex = n - k;
        for (int i = 0; i < k; i++) {
            arr[i] = nums[firstIndex++];
            counter += 1;
        }
        for (int i = 0; i < n -k; i++) {
            arr[counter] = nums[i];
            counter++;
        }
        nums = arr;
//        for(int i = 0; i < n; i++) {
//            nums[i] = arr[i];
       // }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }
}
