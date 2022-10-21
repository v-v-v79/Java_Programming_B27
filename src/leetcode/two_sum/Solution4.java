package leetcode.two_sum;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution4 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        System.out.println(map);
        for (int i = 0; i < nums.length; i++) {
            int secondInt = target - nums[i];
            if(map.containsKey(secondInt) && map.get(secondInt) != i)
                return new int[]{i, map.get(secondInt)};

        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4, 4}, 8)));
    }

}
