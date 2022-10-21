package day51_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods2 {
    public static void main(String[] args) {

        //primitive array to a List
        int[] arr = {1, 2, 3, 4, 5};
        List<Integer> list = Arrays.stream(arr).boxed().toList();
        /*
        Arrays.stream(arr) --> converts the array to a stream(int)
        .boxed --> converts the data from int to Integer -> result is Stream(Integer)
         */

        //list to array
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 3, 4, 4, 5, 5, 6, 6));
        int[] arr1 = list1.stream().mapToInt(n -> n).toArray();
    }
}
