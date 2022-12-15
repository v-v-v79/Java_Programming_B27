package recursion;

public class RussianDollRecursion {

    public static void main(String[] args) {
        russianDoll(7);
    }

    public static void russianDoll(int n) {
        if (n == 1)
            System.out.println("Last Doll " + n);
        else {
            System.out.println("Top side of Doll " + n);
            russianDoll(n - 1);
            System.out.println("Bottom side of Doll" + n);
        }
    }
}

