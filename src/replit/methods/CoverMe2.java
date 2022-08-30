package replit.methods;

import java.util.Arrays;
import java.util.Scanner;

public class CoverMe2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(coverString(in.nextLine(), in.nextLine()));
    }

    public static String coverString(String main, String coverMe) {
        String[] arr1 = new String[1];
        String[] arr2 = new String[1];
        arr1[0] = main;
        arr2[0] = coverMe;
        String main1 = "";
        int fi = 0;
        int li = fi + coverMe.length();
        int j = 0;
        if(!main.contains(coverMe))
            return Arrays.toString(arr1);
        for(int i = 0; i < main.length(); i++) {
            if(i == main.indexOf(coverMe, j)){
                fi = i;
                if(fi != 0) {
                    main1 = main.substring(0, fi) + Arrays.toString(arr2) + main.substring(fi + li);
                    System.out.println(main1);
                }
                else
                    main1 =  Arrays.toString(arr2) + main.substring(li);
                main = main1;
                j = fi + 2;
            }
        }
        return main1;
    }
}
