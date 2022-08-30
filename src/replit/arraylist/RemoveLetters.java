package replit.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveLetters {
    public static String extractNum(String s) {
        String[] arr = s.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        list.removeIf(c -> !Character.isDigit(c.charAt(0)));

        s = "";
        for (String each: list)
            s += each;
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(extractNum(in.next()));
    }
}

