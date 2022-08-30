package leetcode.reverseint;

import java.util.Arrays;

public class Solution {
    public static int reverse(int x) {
        String str = "" + x;
        String temp = "";
        String[] arr = str.split("");
        if (arr[0].equals("-")) {
            temp += arr[0];
            for (int i = arr.length - 1; i > 0; i--)
                temp += arr[i];
        }
        else {
            for (int i = arr.length - 1; i >= 0; i--)
                temp += arr[i];
        }
        long y = Long.parseLong(temp);
        if(y > Integer.MAX_VALUE || y < Integer.MIN_VALUE)
            return 0;
        else
            x = Integer.parseInt(temp);
        return x;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1234567899));
    }
}
