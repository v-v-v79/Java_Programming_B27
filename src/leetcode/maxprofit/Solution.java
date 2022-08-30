package leetcode.maxprofit;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static int maxProfit(int[] prices) {

        int n = prices.length;
        if (n == 0)
            return 0;

        int result = 0;
        int max = 0;
        int sum = 0;

        for (int i = n - 1; i > 0; i--) {
            max = 0;
            if (prices[i] > prices[i - 1]) {
                for (int j = i - 1; j >= 0; j--) {
                    sum = prices[i] - prices[j];
                    if (sum > max)
                        max = sum;
                    if (j == 0) {
                        return result += max;
                    }
                    if (prices[j] > prices[j - 1])
                        continue;
                    else {
                        i = j;
                        i++;
                        break;
                    }
                }
            }
            result += max;
        }
        return result;
    }
    public static void main(String[] args) {

        System.out.println(maxProfit(new int[]{1, 2, 3, 4, 5}));
    }
}
