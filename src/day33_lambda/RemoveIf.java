package day33_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveIf {

    public static String removeLetters(String str) {
       ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        list.removeIf(symbol -> !Character.isDigit(symbol.charAt(0)));
        str = "";
        for (String each: list)
            str += each;

        return str;
    }
    public static String retainLetters(String str) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        list.removeIf(symbol -> !Character.isLetter(symbol.charAt(0)));
        str = "";
        for (String each: list)
            str += each;

        return str;
    }
    public static String retainSpecials(String str) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        list.removeIf(symbol -> Character.isLetterOrDigit(symbol.charAt(0)));
        str = "";
        for (String each: list)
            str += each;

        return str;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(removeLetters(str));
        System.out.println(retainLetters(str));
        System.out.println(retainSpecials(str));
    }
}
