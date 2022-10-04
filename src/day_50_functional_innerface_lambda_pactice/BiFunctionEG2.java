package day_50_functional_innerface_lambda_pactice;

import java.util.*;
import java.util.function.BiFunction;

public class BiFunctionEG2 {
    public static void main(String[] args) {
        BiFunction<Set<String>, List<Integer>, Map<String, Integer>> createMap = (emails, inboxNumbers) -> {
            List<String> listEmails = new ArrayList<>(emails);
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < listEmails.size(); i++) {
                map.put(listEmails.get(i), inboxNumbers.get(i));
            }
            return map;
        };
        Set<String> emails = new LinkedHashSet<>(Arrays.asList("abc@gmail.com", "def@gmail.com", "ghj@gmail.com", "klm@gmail.com"));
        List<Integer> inBoxNumber = new ArrayList<>(Arrays.asList(100, 200, 300, 400));

        System.out.println("createMap.apply(emails, inBoxNumber) = " + createMap.apply(emails, inBoxNumber));
    }
}
