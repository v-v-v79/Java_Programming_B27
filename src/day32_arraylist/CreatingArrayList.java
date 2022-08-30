package day32_arraylist;

import java.util.ArrayList;

public class CreatingArrayList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("monday");
        list.add("java");
        list.add("movies");
        list.add("sports");
        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();
        list2 = list;
        list2.set(0, "tuesday");
        System.out.println(list2);

        ArrayList<String> list3 = new ArrayList<>(list);
        list3.set(0, "Wednesday");
        System.out.println(list3);

    }
}
