package day_50_functional_innerface_lambda_pactice;

import java.util.function.BiConsumer;

public class BiConsumerEG {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> multiplicationTable = (num, max) -> {
            for (int i = 1; i < max; i++) {
                System.out.println(num + "x" + i + " = " + (num * i));
            }
        };
        multiplicationTable.accept(5, 15);
    }
}
