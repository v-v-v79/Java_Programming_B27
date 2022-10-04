package day_49_functional_interface_lambda_exp.consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEG {
    public static void main(String[] args) {
        Consumer<int[]> printArray = arr -> {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("i = " + i);
            }
        };
        printArray.accept(new int[]{1,2,3,4,5});

        List<String> list = new ArrayList<>(Arrays.asList("word", "java", "hello", "cydeo"));
        list.forEach(each -> System.out.println("each = " + each));
        list.forEach(each -> System.out.println("each = " + each.length()
                + each.charAt(0) + each.charAt(each.length() - 1)));
    }
}
