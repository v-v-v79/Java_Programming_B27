package replit.methods;

import java.util.Scanner;

public class CalculateLetters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str) {

        String res = "";

        for (int i = 0; i < str.length(); i++){
            int counter = 0;
            for (int j = 0; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    counter++;
                }
            }
            if(!res.contains("" + str.charAt(i))){
                res += "" + counter + str.charAt(i);
            }
        }
        return res;
    }

}

