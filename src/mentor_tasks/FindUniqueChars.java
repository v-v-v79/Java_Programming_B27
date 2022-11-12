package mentor_tasks;

import java.util.HashMap;
import java.util.Map;

public class FindUniqueChars {
    public static void main(String[] args) {
        String str = BaseClass.scanner.nextLine();
        System.out.println(findUniqueChars(str));
    }

    public static String findUniqueChars(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        str = "";
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1)
                str += entry.getKey();
        }
        return str;
    }
}
