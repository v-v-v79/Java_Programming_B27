package leetcode.removeduplicates;

import java.util.Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        /*int k = 1;
        int i = 0;
        int h = 1;
        for(int j = 0; j < nums.length; j++) {
            if(nums[i] != nums[j]){
                k += 1;
                nums[h] = nums[j];
                h++;
                i = j;
            }
        }
        System.out.println(Arrays.toString(nums));
        int[] arr = Arrays.copyOf(nums, 5);
        System.out.println(Arrays.toString(arr));
        String[] arr2 = Arrays.toString(arr).split(", ");
        String arr3 = String.join(", ", arr2);
        System.out.println(arr3.replace("[", "").replace("]", ""));
        for (int eachInner: arr)
            System.out.print(eachInner + " ");
        System.out.println();
        return k;
    }

    */
        int n = nums.length;
        if(n == 0)
            return 0;
        int insertIndex = 1;
        for (int i = 1; i < n; i++){
            if(nums[i] != nums[i - 1]) {
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return insertIndex;
    }
    public static void main(String[] args){

        int k = removeDuplicates(new int[]{1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5});
        System.out.println(k);
    }
}
