package day47_iterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Java", "Victory", "Cydeo", "Yes", "No"));
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            if (iterator.next().length() < 3)
                iterator.remove();
        }
        System.out.println(list);
    }
}
