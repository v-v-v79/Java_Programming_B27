package mentor_tasks;


import java.util.Set;
import java.util.TreeSet;

public class DivisibleBy3_5_15 {
    public static void main(String[] args) {
        Set<Integer> set15 = new TreeSet<>();
        Set<Integer> set3 = new TreeSet<>();
        Set<Integer> set5 = new TreeSet<>();
        Set<Integer> setOthers = new TreeSet<>();
        for (int i = 1; i < 101; i++) {
            if (i % 15 == 0) {
                set15.add(i);
            } else if (i % 5 == 0) {
                set5.add(i);
            } else if (i % 3 == 0) {
                set3.add(i);
            }
        }
        System.out.println("Divisible By 15 " + set15.toString()
                .replace("[", "").replace("]", "")
                .replace(",", ""));
        System.out.println("Divisible By 5 " + set5.toString()
                .replace("[", "").replace("]", "")
                .replace(",", ""));
        System.out.println("Divisible By 3 " + set3.toString()
                .replace("[", "").replace("]", "")
                .replace(",", ""));
    }
}


