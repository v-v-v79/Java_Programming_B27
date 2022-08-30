package replit.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Swap {

    public static ArrayList<String> list(ArrayList<String> list, int pos1, int pos2) {
        Collections.swap(list, pos1, pos2);
        return list;
    }

}
