package leetcode.arrayintersection;

import java.util.Arrays;

public class Solution {
    public static int[] intersect(int[] nums1, int[] nums2) {

        int[]nums3 = new int[1];

        for(int i = 0; i < nums1.length; i++){
            int counter = 0;
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    counter++;
                    if(i < nums1.length - 1)
                        i++;
                    else
                        break;
                }
            }
            if(counter > 1){
                nums3 = new int[counter];
                break;
            }
//            else if(!(i == nums1.length - 1))
//                i--;
//            else if(counter <= 1)
//                return nums3;
        }
        int h = 0;
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    nums3[h] = nums1[i];
                    if(i < nums1.length - 1){
                        i++;
                        h++;
                    }
                    else
                        break;
                    if(h == nums3.length)
                        return nums3;
                }
            }
        }
        return nums3;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
}
