package mentor_tasks.permutation;

public class Solution {

    static String convertToString(char[] chars) {
        return String.valueOf(chars);
    }
    static void printPermutedString(String string, String permutedString) {

        if (string.length() == 0) {
            System.out.print(permutedString + " ");
            return;
        }
        for (int i = 0; i < string.length(); i++) {
            char charAtI = string.charAt(i);

            String restOfString = string.replace(charAtI + "", "");
            printPermutedString(restOfString, permutedString + charAtI);
        }
    }
    public static void main(String[] args) {
        char[] array = {'a','b','c'};
        printPermutedString(convertToString(array), "");
    }
}
