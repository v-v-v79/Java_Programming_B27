package day_50_functional_innerface_lambda_pactice;

import java.util.function.BiFunction;

public class BiFunctionEG {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> maxNumber = (a, b) ->
                a > b ? a : b;
        System.out.println(maxNumber.apply(6, 12));
    }
}
