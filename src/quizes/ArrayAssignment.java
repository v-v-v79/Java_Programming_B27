package quizes;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAssignment {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int[] arr2 = arr;
        int[] arr3 = { 3, 4, 5 };

        arr2[0] = 0;
        arr[1] = 0;
        arr2 = Arrays.copyOf(arr3, arr3.length);
        arr = arr3;
        arr2[0] = 5;
        arr[0] = 6;
        arr = Arrays.copyOf(arr2, arr2.length);
        arr[0] = 7;

        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1, 1);
        list.add(2);
        list.add(3, 3);

        System.out.println(list);



//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.toString(arr3));
    }
}
