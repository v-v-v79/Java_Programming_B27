package mentor_tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(frequencyOfChars(str));
    }

    public static String frequencyOfChars(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        StringBuilder strBuilder = new StringBuilder();
        for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {
            strBuilder.append(characterIntegerEntry.getKey());
            strBuilder.append(characterIntegerEntry.getValue());
        }
        str = strBuilder.toString();
        return str;
    }
}
