package day33_lambda;

import java.util.ArrayList;
import java.util.Arrays;

public class SumString {

    public static ArrayList<Integer> sumDigits(ArrayList<String> list) {
        ArrayList<Integer> sumNum = new ArrayList<>();
        for (String eachStr: list) {
            int sum = 0;
            for (String eachDigit: eachStr.split("")) {
                sum += Integer.parseInt(eachDigit);
            }
            sumNum.add(sum);
        }
        return sumNum;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("1234", "3456", "8794"));
        System.out.println(sumDigits(list));
    }
}

