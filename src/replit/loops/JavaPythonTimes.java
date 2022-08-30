package replit.loops;

import java.util.Scanner;

public class JavaPythonTimes {
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
            hasCat = strCats.contains("java");
            if(hasCat) {
                cats++;
                strCats = strCats.substring(strCats.indexOf("java") + 4);
            }
            else
                break;
        }
        while (true) {
            hasDog = strDogs.contains("python");
            if(hasDog) {
                dogs++;
                strDogs = strDogs.substring(strDogs.indexOf("python") + 6);
            }
            else
                break;
        }
        System.out.println(cats == dogs);
    }
}
