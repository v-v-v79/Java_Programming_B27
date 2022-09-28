package day_48_maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Season {
    public static void main(String[] args) {
        Map<String, Double> temperature = new HashMap<>();
        temperature.put("summer", 85.0);
        temperature.put("fall", 68.0);
        temperature.put("winter", 30.0);
        temperature.put("spring", 68.0);
        System.out.println(temperature);

        System.out.println("Average for winter " + temperature.get("winter"));
        System.out.println("Average for spring " + temperature.get("spring"));
        System.out.println("Average for summer " + temperature.get("summer"));
        System.out.println("Average for fall " + temperature.get("fall"));

        System.out.println(temperature.containsKey("mid summer"));
        System.out.println(temperature.containsValue(100.0));

        System.out.println(temperature.values());
        int before = temperature.values().size();
        int after = new HashSet<>(temperature.values()).size();
        System.out.println(before);
        System.out.println(after);
        System.out.println(before == after ? "No duplicate" : "Duplicate values");

        System.out.println(avgTemperature(temperature));
    }

    public static double avgTemperature(Map<String, Double> map) {
        double average = 0;
        for (double eachTemp: map.values()) {
            average += eachTemp;
        }
        return average/map.size();
    }
}
