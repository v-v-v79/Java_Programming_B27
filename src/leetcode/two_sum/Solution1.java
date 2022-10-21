package leetcode.two_sum;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution1 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int j = 0;
        for (int each : nums) {
            map.put(j, each);
            j++;
        }
        System.out.println(map);
        for (int i = 0; i < nums.length; i++) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (nums[i] + entry.getValue() == target && entry.getKey() != i) {
                    nums[0] = i;
                    nums[1] = entry.getKey();
                    return Arrays.copyOfRange(nums, 0, 2);
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4}, 5)));
    }
}
