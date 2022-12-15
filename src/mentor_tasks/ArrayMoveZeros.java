package mentor_tasks;

import java.util.Arrays;

public class ArrayMoveZeros {

    public static void main(String[] args) {

        int[] arr = {0, 0, 0, 3, 6, 8, 0, 5, 9};
        int[] res = moveZeros(arr);
        System.out.println(Arrays.toString(res));
    }


    public static int[] moveZeros(int[] arr) {

        int[] res = new int[arr.length];
        int i = 0;
        for (int each : arr) {
            if (each != 0) {
                res[i] = each;
                i++;
            }
        }
        return res;
    }
}

