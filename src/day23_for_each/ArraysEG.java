package day23_for_each;

import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysEG {
    public static void main(String[] args) {
        String[] names = new String[5];
        Scanner input = new Scanner(System.in);
        int i = 0;
        for (String str: names) {
            names[i] = input.nextLine();
            i++;
        }
        System.out.println(Arrays.toString(names));

        int[] nums = new int[5];
        System.out.println(Arrays.toString(nums));
    }
}
