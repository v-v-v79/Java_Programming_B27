package leetcode.plusone;

import java.math.BigInteger;
import java.util.Arrays;

public class Solution1 {
    public static int[] plusOne(int[] digits) {
        String str = Arrays.toString(digits).replace("[", "").
                replace("]", "").replaceAll(",", "").
                replaceAll(" ", "");
        BigInteger num = new BigInteger(str);
        BigInteger one = new BigInteger("1");
        num = num.add(one);
        System.out.println(num);
        str = "" + num;
        String[] arr = str.split("");
        int[] arrD = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            arrD[i] = Integer.parseInt(arr[i]);
        }
        return arrD;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(plusOne(arr)));
    }

}
