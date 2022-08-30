package day31_arraylist;

import java.util.ArrayList;

public class RemoveVowels {
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();
        char letter = 'a';
        while(letter <= 'z') {
            list.add(letter);
            letter++;
        }
        System.out.println(list);

        int i = list.size() - 1;
        String vowels = "aeiou";
        while(list.get(i) >= 'a'){
            if(vowels.contains(list.get(i).toString())) {
                list.remove(i);
            }
            i--;
            if(i < 0)
                break;
        }
        System.out.println(list);
    }
}
