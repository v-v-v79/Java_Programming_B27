package day_48_maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Apple {
    public static void main(String[] args) {
        String str = "apple";
        Map<Character, Integer> counter = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            if(counter.containsKey(str.charAt(i))) {
                counter.put(key, counter.get(key) + 1);
            } else {
                counter.put(str.charAt(i), 1);
            }
        }
        System.out.println(counter.keySet());
    }
}
