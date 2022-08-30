package day31_arraylist;

import java.util.ArrayList;

public class ListAbs {
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();
        char letter = 'a';
        while(letter <= 'z') {
            list.add(letter);
            letter++;
        }
        System.out.println(list);
    }
}
