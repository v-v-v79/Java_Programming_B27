package day32_arraylist;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class RandomNums {

    public static ArrayList<Integer> random(int limit) {

        ArrayList<Integer> nums = new ArrayList<>(limit);
        Random random = new Random();
        for (int i = 0; i < limit; i++) {
            nums.add(random.nextInt(1000));
        }
        return nums;
    }

    public static void main(String[] args) {
//        System.out.println(random(10));
//
//        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(951, 682, 633, 505, 836, 505, 479, 954, 535, 852));
//        System.out.println(Collections.min(nums2));
//        System.out.println(Collections.max(nums2));
//        System.out.println(Collections.frequency(nums2, 954));
//        Collections.sort(nums2);
//        System.out.println(nums2);
//        Collections.reverse(nums2);
//        System.out.println(nums2);
//        Collections.shuffle(nums2);
//        System.out.println(nums2);

        String str = "qweoiuerwdsdfhjwe";
        ArrayList<String> list5 = new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println(list5);
        System.out.println(Collections.frequency(list5, "w"));
    }
}
