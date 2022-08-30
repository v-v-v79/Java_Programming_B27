package day_21_nested_loops;

public class Pypamid {
    public static void main(String[] args) {

        int spaces = 11;

        for (int i = 0; i < 22; i++) {
            for (int k = 0; k < spaces; k++)
                System.out.print(" ");
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            i += 1;
            spaces--;
        }
    }
}
