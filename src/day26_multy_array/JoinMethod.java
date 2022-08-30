package day26_multy_array;

import java.util.Arrays;

public class JoinMethod {
    public static void main(String[] args) {
        String[] arr = {"yellow", "hello", "java", "monday"};
        String arrPrint = String.join(", ", arr);
        System.out.println(arrPrint);
        String[] arr2 = arr;
        String[] arr3 = Arrays.copyOf(arr, 7);
        System.out.println(Arrays.toString(arr3));
//        System.out.println(Arrays.toString(arr2));
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.binarySearch(arr, "java"));
        System.out.println(Arrays.equals(arr, arr3));
    }
}
