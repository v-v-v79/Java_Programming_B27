package day33_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Swap {

    public static ArrayList<String> swapPairs(ArrayList<String> list) {

        for (int i = 0; i < list.size(); i += 2) {

            String temp = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, temp);

        }

        for (int i = 0; i < list.size(); i += 2) {
            Collections.swap(list, i, i + 1);
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("cat", "in", "the", "hat"));
        System.out.println(swapPairs(list));
    }

}
