package day33_lambda;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAll {

    public static ArrayList<String> removeAllOnes(ArrayList<String> list) {

        list.removeAll(Arrays.asList("1"));
        return list;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("1", "2", "17"));
        System.out.println(removeAllOnes(list));
    }
}

