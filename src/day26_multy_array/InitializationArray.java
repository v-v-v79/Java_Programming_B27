package day26_multy_array;

import java.util.Arrays;

public class InitializationArray {
    public static void main(String[] args) {
        String str  = "arr";
//        int index = str.indexOf("carr");
//        //str = str.substring(2,8);
//        boolean ends = str.endsWith("rr");
//        System.out.println(index);
//        System.out.println(ends);
        do {
            str = str.replaceFirst("r", "");

        }while(str.contains("r"));
        System.out.println(str);
    }
}
