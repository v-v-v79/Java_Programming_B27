package day_50_functional_innerface_lambda_pactice;

import java.util.function.BiPredicate;

public class BiPredicateEG {
    public static void main(String[] args) {
        BiPredicate<int[], Integer> contains = (arr, num) -> {
            for (int each : arr) {
                if(each == num)
                    return true;
            }
            return false;
        };

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("contains.test(arr, 12) = " + contains.test(arr, 12));
        System.out.println("contains.test(arr, 3) = " + contains.test(arr, 3));
    }
}
