package day26_multy_array;

import java.util.Arrays;
import java.util.Scanner;

public class StringMultyArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int chapters = 5;
        String[][] book = new String[chapters][];
        for (int i = 0; i < chapters; i++) {
            System.out.println("Type your chapter:");
            book[i] = input.nextLine().trim().split(" ");
        }
        char[] upper = {'A', 'B'};
        char[] lower = {'a', 'b'};
        char[] other = {'2', '1'};

        char multy [][] = new char[3][];
        multy[0] = upper;
        multy[1] = lower;
        multy[2] = other;

        for (char[] eachInner: multy)
            System.out.println(eachInner);

        for (String[] eachInner: book)
            System.out.println(Arrays.toString(eachInner).replace("[", "").replace("]", ""));
    }
}
