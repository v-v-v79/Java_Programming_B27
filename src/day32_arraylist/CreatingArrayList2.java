package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CreatingArrayList2 {
    public static void main(String[] args) {

        Integer[]arr = {1,2,3,4,5};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(5,4,3,2,1));

        System.out.println(Arrays.toString(arr));
        System.out.println(list);
        System.out.println(list2);


    }
}
