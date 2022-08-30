package day23_for_each;

import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        array[0] = 100;
        int j = 100;

        for (int i = 0; i < array.length; i++) {
            array[i] = j;
            j += 11;
        }
        System.out.println(Arrays.toString(array));

        int i = 0;
        j = 33;
        int k = 0;
        for (int h: array) {
            array[i] = j;
            i++;
            j--;
            System.out.println(h);
            k = h;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(k);
    }
}

