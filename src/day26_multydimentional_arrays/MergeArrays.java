package day26_multydimentional_arrays;

import day23_for_each.ArraysEG;

import java.util.Arrays;

public class MergeArrays {

    public static void merge() {

        int j = 1;

        int size = 0;
        int[][] arr = new int[3][5];

        for (int[] eachInner : arr) {
            size += eachInner.length;
            for (int i = 0; i < eachInner.length; i++) {
                eachInner[i] = j++;
            }
        }

        int h = 0;
        int[] merged = new int[size];
        for (int[] eachInner: arr) {
            for (int eachNum: eachInner){
               merged[h++] = eachNum;
            }
        }

        System.out.println(size);
        System.out.println(Arrays.toString(merged));
        System.out.println(Arrays.deepToString(arr));
}

    public static void main(String[] args) {
        merge();
    }
}
