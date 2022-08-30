package replit.loops;

import java.util.Scanner;

public class CatDogTimes {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        boolean hasCat;
        boolean hasDog;
        int cats = 0;
        int dogs = 0;
        String strCats = str;
        String strDogs = str;

        while (true) {
            hasCat = strCats.contains("CatDogTimes");
            if(hasCat) {
                cats++;
                strCats = strCats.substring(strCats.indexOf("cat") + 3);
            }
            else
                break;
        }
        while (true) {
            hasDog = strDogs.contains("dog");
            if(hasDog) {
                dogs++;
                strDogs = strDogs.substring(strDogs.indexOf("dog") + 3);
            }
            else
                break;
        }
        System.out.println(cats + " " + dogs);
    }
}
