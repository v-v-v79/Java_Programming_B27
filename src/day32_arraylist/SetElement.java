package day32_arraylist;

import java.util.ArrayList;

public class SetElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

        list.set(2, 300);
        System.out.println(list);
    }
}
