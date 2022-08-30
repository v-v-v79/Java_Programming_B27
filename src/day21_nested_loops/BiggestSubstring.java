package day21_nested_loops;

public class BiggestSubstring {
    public static void main(String[] args) {
        String str = "aaabbbcccccddd";
        String longest = "";
        String each = "";

        for (int i = 0; i < str.length() - 1; i++) {
            each += str.charAt(i);
            if(str.charAt(i) != str.charAt(i + 1)) {
                if (each.length() > longest.length())
                    longest = each;
                each = "";
            }
        }
        System.out.println(longest);
    }
}
