package day33_lambda;

import java.util.ArrayList;
import java.util.Arrays;

public class HidingPasswords {

    public static ArrayList<String> tostars(ArrayList<String> list) {

        ArrayList<String> hidden = new ArrayList<>();

        for (String each: list) {
          hidden.add(stars(each.length()));
        }
        return hidden;
    }
    public static String stars (int length){

        String stars = "";

        for(int i = 0; i < length; i++) {
            stars += "*";
        }
        return stars;
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Hello", "Java", "SDET"));
        System.out.println(tostars(list));

    }
}
