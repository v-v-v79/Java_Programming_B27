package day_48_maps;

import day39_encaps_recap.Pizza;

import java.awt.event.PaintEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBaseEG {
    public static void main(String[] args) {
        Map<String, String> person1 = new HashMap<>();
        person1.put("FIRST_NAME", "James");
        person1.put("LAST_NAME", "Bond");
        person1.put("AGE", "40");
        person1.put("ADDRESS", "131 PARK DR, LONDON");

        List<Map<String, String>> allPeople = new ArrayList<>();
        allPeople.add(person1);
        allPeople.add(Map.of("FIRST_NAME", "Anna", "LAST_NAME", "Jones", "AGE", "30","ADDRESS", "3212 TUCKER AVE, LONDON"));
        System.out.println(allPeople.get(0));
        System.out.println(allPeople.get(1).get("FIRST_NAME"));
    }
}
