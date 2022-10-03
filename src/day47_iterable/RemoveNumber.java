package day47_iterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveNumber {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(5, 4, 3, 6, 1, -67, 45, 2, -8));
        System.out.println(nums);
        //Remove all numbers less or equal to 5
        Iterator<Integer> iterator = nums.iterator();
        while (iterator.hasNext()){
            if (iterator.next() <= 5)
                iterator.remove();
        }
        System.out.println(nums);
    }
}
