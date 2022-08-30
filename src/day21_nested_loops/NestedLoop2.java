package day21_nested_loops;

public class NestedLoop2 {
    public static void main(String[] args) {

        int stars = 1;

        for (int i = 0; i < 11; i++) {
            for (int k = 0; k < stars; k++) {
                for (int j = 0; j <= i; j++)
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
            stars++;
        }
    }
}
