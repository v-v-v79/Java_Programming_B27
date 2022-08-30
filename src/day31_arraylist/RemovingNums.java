package day31_arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class RemovingNums {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(200);
        list.add(300);
        list.add(200);
        list.add(300);
        System.out.println(list);
        list.removeAll(Collections.singleton((Integer) 300));
        System.out.println(list);
    }
}
