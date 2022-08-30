package leetcode.hasduplicate;

public class HasDuplicate {
    public static boolean containsDuplicate(int[] nums) {

        for(int i = 0; i < nums.length; i++){
            int counter = 0;
            for(int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j])
                    counter++;
                if(counter > 1)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,4,5,6,1,7,8,2}));
    }
}
