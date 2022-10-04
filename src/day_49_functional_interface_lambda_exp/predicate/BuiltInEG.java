package day_49_functional_interface_lambda_exp.predicate;

import java.util.function.Predicate;

public class BuiltInEG {
    public static void main(String[] args) {
        Predicate<Integer> isPrime = p -> {
            for (int i = 2; i < p/2; i++) {
                if(p % i == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println("isPrime.test(8) = " + isPrime.test(8));
        System.out.println("isPrime.test(8) = " + isPrime.test(58));

    }
}
