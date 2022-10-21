package leetcode.arrayintersection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution3_Works {
    public static int[] intersect(int[] nums1, int[] nums2) {
        int counter = 0;
        if(nums1.length > nums2.length) {
            int[] temp;
            temp = nums2;
            nums2 = nums1;
            nums1 = temp;
        }
        List<Integer> list1 = new ArrayList<>(Arrays.stream(nums1).boxed().toList());
        List<Integer> list2 = new ArrayList<>(Arrays.stream(nums2).boxed().toList());
        List<Integer> list3 = new ArrayList<>();
        List<Integer> list1Copy = new ArrayList<>(list1);
        List<Integer> list2Copy = new ArrayList<>(list2);
        for (Integer integer : list1) {
            for (Integer integer1 : list2) {
                if(integer.equals(integer1) &&
                        list1Copy.contains(integer) && list2Copy.contains(integer)){
                    list3.add(integer);
                    list1Copy.remove(integer);
                    list2Copy.remove(integer);
                }
            }
        }
        return list3.stream().mapToInt(i -> i).toArray();
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
