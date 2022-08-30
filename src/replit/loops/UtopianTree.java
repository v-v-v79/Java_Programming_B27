package replit.loops;

public class UtopianTree {
    public static void main(String[] args) {

        int year = 1;
        int growth = 1;
        int size = 1;

        for (int i = 0; i < 3; i++) {
            System.out.println("year " + year + " - growth " + growth + " cm\n " +
                    "tree size: " + size + " cm");
            year++;
            size++;
        }
        growth++;
        size++;
        for (int i = 3; i < 10; i++) {
            System.out.println("year " + year + " - growth " + growth + " cm\n " +
                    "tree size: " + size + " cm");
            year++;
            size += 2;
        }
    }
}
