package day26_multy_array;

import java.util.Arrays;

public class MultyArrayEx {
    public static void main(String[] args) {
        char[][] dim = {{'h', 'e', 'y'}, {'b', 'a', 'y'}};

        char[] upper = {'A', 'B'};
        char[] lower = {'a', 'b'};
        char[] other = {'2', '1'};

        char multy [][] = new char[3][];
        multy[0] = upper;
        multy[1] = lower;
        multy[2] = other;

        System.out.println(Arrays.toString(multy));
        System.out.println(Arrays.deepToString(multy));
        System.out.println(Arrays.toString(multy[0]));

        for (int i = 0; i < multy.length; i++){
            for(int j = 0; j < multy[j].length; j++)
                System.out.print(multy[i][j]);
            System.out.print(" ");
        }
        System.out.println();
        for (char[] eachInner: multy){
            for (char eachChaR: eachInner)
                System.out.println(eachChaR);
        }
        for (char[] eachInner: multy)
            System.out.println(eachInner);
    }
}
