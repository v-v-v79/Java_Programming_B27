package leetcode.two_sum;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution2 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int j = 0;
        for (int each : nums) {
            map.put(j, each);
            j++;
        }
        System.out.println(map);
        int i = 0;
        while (i < nums.length) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == target - nums[i] && entry.getKey() != i) {
                    nums[0] = entry.getKey();
                    nums[1] = i;
                    return Arrays.copyOfRange(nums, 0, 2);
                }
            }
            i++;
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
    }

}
