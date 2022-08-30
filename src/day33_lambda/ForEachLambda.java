package day33_lambda;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEachLambda {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("hello", "java", "world"));
        ArrayList<String> list1 = new ArrayList<>();
        list.forEach(each ->
        {
            String str = "";
            for (int i = each.length() -1; i >= 0; i--) {
                str += each.charAt(i);
            }
            list1.add(str);
        });
        System.out.println(list1);
    }
}
