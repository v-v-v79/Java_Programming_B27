package day_48_maps;

import java.util.*;

public class Countries {
    public static void main(String[] args) {
        Map<String, List<String>> countries = new HashMap<>();
        countries.put("United States", new ArrayList<>(Arrays.asList("Chicago", "Dallas", "NY", "LA", "Irvine", "San Diego")));
        countries.put("Russia", new ArrayList<>(Arrays.asList("Moscow", "Gagarin", "Smolensk", "Ryazan", "Tomsk", "Odintsovo")));

        System.out.println(countries);

        countries.get("United States").add("Seattle");
        System.out.println(countries.get("United States").get(0));

        System.out.println(countries);

        for(Map.Entry<String, List<String>> eachEntry: countries.entrySet()) {
            for(String eachCity : eachEntry.getValue()){
                if(eachCity.startsWith("O") && eachCity.endsWith("o"))
                    System.out.println(eachCity);
            }
        }
        System.out.println(countries.get("Russia"));
        System.out.println(countries.get("United States"));

    }
}
