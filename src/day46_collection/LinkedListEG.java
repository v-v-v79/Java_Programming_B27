package day46_collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEG {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        System.out.println(list.indexOf(3));
        list.add(4, 6);
        System.out.println();
    }

}
