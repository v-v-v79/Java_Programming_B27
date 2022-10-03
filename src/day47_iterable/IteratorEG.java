package day47_iterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorEG {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("James", "Anna", "Eric", "George"));
        for (String each : names){
            System.out.println(each);
        }
        System.out.println();

        Iterator<String> iterator = names.iterator();
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
