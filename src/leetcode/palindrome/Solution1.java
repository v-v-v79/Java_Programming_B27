package leetcode.palindrome;

import java.util.Scanner;

public class Solution1 {
    public static boolean isPalindrome(int x) {
        if (x < 10)
            return true;
        int y = x % 10;
        int z = x - (10 * y);
        if (y == z)
            return true;
        return false;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(isPalindrome(input.nextInt()));
    }
}
