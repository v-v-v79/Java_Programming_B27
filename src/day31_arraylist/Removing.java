package day31_arraylist;

import java.util.ArrayList;

public class Removing {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Iron Man");
        list.add("Spider Man");
        list.add("Thor");
        list.add("Captain America");
        list.add("Hawkeye");
        System.out.println(list);
        System.out.println(list.remove(2));
        System.out.println(list);
        System.out.println(list.remove("Iron Man"));
        System.out.println(list);
        System.out.println(list.remove(0));
        System.out.println(list);

    }
}
