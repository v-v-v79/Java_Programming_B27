package day_48_maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapEG {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(null, "Five");

        System.out.println(map);

        Map<Integer, String> map2 = new LinkedHashMap<>();
        map2.put(1, "One");
        map2.put(2, "Two");
        map2.put(3, "Three");
        map2.put(4, "Four");
        map2.put(null, "Five");

        System.out.println(map2);

        Map<Integer, String> map3 = new TreeMap<>();
        map3.put(3, "One");
        map3.put(5, "Two");
        map3.put(1, "Three");
        map3.put(4, "Four");
        map3.put(2, "Five");

        System.out.println(map3);
    }
}
