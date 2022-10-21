package leetcode.two_sum;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution3 {
    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if ((nums[i] + nums[j] == target) && i != j){
                    nums[0] = i;
                    nums[1] = j;
                    return Arrays.copyOfRange(nums, 0, 2);
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{0,4,3,0}, 0)));
    }

}
