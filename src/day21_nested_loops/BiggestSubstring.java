package day21_nested_loops;

public class BiggestSubstring {
    public static void main(String[] args) {
        String str = "aaabbbcccccddd";
        String longest = "";
        StringBuilder each = new StringBuilder();

        for (int i = 0; i < str.length() - 1; i++) {
            each.append(str.charAt(i));
            if(str.charAt(i) != str.charAt(i + 1)) {
                if (each.length() > longest.length())
                    longest = each.toString();
                each = new StringBuilder();
            }
        }
        System.out.println(longest);
    }
}
