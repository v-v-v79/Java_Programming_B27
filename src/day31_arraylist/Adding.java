package day31_arraylist;

import java.util.ArrayList;

public class Adding {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hat");
        list.add("Shoes");
        System.out.println(list);
        list.add(1, "Jacket");
        System.out.println(list);
        list.add(0, "Towel");
        System.out.println(list);
        list.add(1, "Car");
        System.out.println(list);
    }
}
