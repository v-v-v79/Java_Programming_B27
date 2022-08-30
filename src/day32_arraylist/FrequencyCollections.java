package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyCollections {

    public static void main(String[] args) {
        String str1 = "aaabbbbccccdddd";
        String str2 = freqCollections(str1);
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }

    private static String freqCollections(String str) {
        String result ="";

        ArrayList<String> str1 = new ArrayList<>(Arrays.asList(str.split("")));
        for(String eachLetter: str1){
            if(!(result.contains(eachLetter))){
                result += eachLetter + Collections.frequency(str1, eachLetter);
            }
        }
        return result;
    }
}
