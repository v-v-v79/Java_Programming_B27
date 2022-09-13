package leetcode.palindrome;

import java.util.Scanner;

public class Solution1 {
    public static boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        if(x < 10)
            return true;
        String str = "" + x;
        char[] arr = str.toCharArray();
        int j = arr.length - 1;
        boolean isP = false;
        for (int i = 0; i < arr.length / 2; i++) {
            if(arr[i] == arr[j]){
                j--;
                isP = true;
            }
            else {
                isP = false;
                break;
            }
        }
        return isP;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(isPalindrome(input.nextInt()));
    }
}
