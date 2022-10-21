package leetcode.arrayintersection;

import java.util.Arrays;

public class Solution2 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        int counter = 0;
        if(nums1.length > nums2.length) {
            int[] temp;
            temp = nums2;
            nums2 = nums1;
            nums1 = temp;
        }
        String nums1Str = Arrays.toString(nums1);
        String nums2Str = Arrays.toString(nums2);
        String nums2Copy = nums2Str;
        String nums1Copy = nums1Str;
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j] && nums2Str.contains(nums1[i] + "") && nums1Str.contains(nums1[i] + "")){
                    counter++;
                    nums2Str = nums2Str.replaceFirst(nums1[i] + "", "");
                    nums1Str = nums1Str.replaceFirst(nums1[i] + "", "");
                    break;
                }
            }
        }
        int[] res = new int[counter];
        counter = 0;
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j] && nums2Copy.contains(nums1[i] + "") && nums1Copy.contains(nums1[i] + "")){
                    res[counter] = nums1[i];
                    counter++;
                    nums2Copy = nums2Copy.replaceFirst(nums1[i] + "", "");
                    nums1Copy = nums1Copy.replaceFirst(nums1[i] + "", "");
                    break;
                }
            }
        }
        System.out.println(nums1Copy);
        System.out.println(nums2Copy);
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {61,24,20,58,95,53,17,32,45,85,70,20,83,62,35,89,5,95,12,86,
                58,77,30,64,46,13,5,92,67,40,20,38,31,18,89,85,7,30,67,34,62,35,47,
                98,3,41,53,26,66,40,54,44,57,46,70,60,4,63,82,42,65,59,17,98,29,72,1,
                96,82,66,98,6,92,31,43,81,88,60,10,55,66,82,0,79,11,81};
        int[] nums2 = {5,25,4,39,57,49,93,79,7,8,49,89,2,7,73,88,45,15,34,92,84,38,
                85,34,16,6,99,0,2,36,68,52,73,50,77,44,61,48};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
}
