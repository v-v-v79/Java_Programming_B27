package day_49_functional_interface_lambda_exp.function_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionIF_EG {
    public static void main(String[] args) {
        Function<int[], List<Integer>> convertToList = (arrNums) -> {
            List<Integer> list = new ArrayList<>();
            for (int each : arrNums) {
                list.add(each);
            }
            return list;
        };
        int[] arr = {1, 2, 3, 4, 5};
        List<Integer> list = convertToList.apply(arr);
        System.out.println("list = " + list);

        //Function<int[], int[]> swapElements = (array1) -> {
//            int[] array2;
//            for (int i : array1) {
//                int temp = array1[i];
//
//            }
//            return array2;
        //};
    }
}
