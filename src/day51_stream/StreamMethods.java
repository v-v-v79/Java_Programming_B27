package day51_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {
        //Create stream
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        list.stream();//create stream, need to do more
        System.out.println("list.stream() = " + list.stream());

        int[] arr1 = {1, 2, 3, 4, 5};
        Arrays.asList(arr1); // made list from array
        //distinct : removes duplicates
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 5, 5, 5));
        System.out.println("list2.stream().distinct() = " + list2.stream().distinct()); // it's not ArrayList anymore, stream is not a data structure
        System.out.println("list2.stream().distinct().collect(Collectors.toList()) = " + list2.stream().distinct().collect(Collectors.toList()));
        //converts stream back to the List type
        System.out.println("list2 = " + list2);
        list2 = list2.stream().distinct().collect(Collectors.toList());
        System.out.println("list2 = " + list2);
        int[] arr2 = {1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 5, 5, 5};
        arr2 = Arrays.stream(arr2).distinct().toArray();
        System.out.println(Arrays.toString(arr2));

        //skip
        List<String> list3 = new ArrayList<>(Arrays.asList("java", "world", "bike", "fall", "lake", "pound", "sun", "fishing"));
        System.out.println("list3.stream().skip(3).collect(Collectors.toList()) = " + list3.stream().skip(3).toList());
        System.out.println("list3.stream().skip(3).collect(Collectors.toList()) = " + list3.stream().skip(6).collect(Collectors.toList()));
        System.out.println("list3.stream().skip(3).collect(Collectors.toList()) = " + list3.stream().skip(10).collect(Collectors.toList()));

        // limit(): keep a certain number of elements
        List<String> list4 = new ArrayList<>(Arrays.asList("java", "world", "bike", "fall", "lake", "pound", "sun", "fishing"));
        System.out.println("list4.stream().limit().toList() = " + list4.stream().limit(3).toList());

        //using both limit and skip
        System.out.println("list4.stream().limit(3).skip(2).toList() = " + list4.stream().limit(3).skip(2).toList());

        //count() elements
        List<String> list5 = new ArrayList<>(Arrays.asList("java", "world", "bike", "fall", "lake", "lake", "lake", "pound", "sun", "fishing"));
        System.out.println("list5.stream().count() = " + list5.stream().count());
        System.out.println("list5.stream().count() = " + list5.stream().distinct().count());

        //task: determine number of unique characters
        String str = "aaaaaabbbbbbbbbcccccccccddddddeeeeeeeefffffff";
        System.out.println("Arrays.stream(str.split(\"\")).distinct().toList() = "
                + Arrays.stream(str.split("")).distinct().toList());

    }
}
