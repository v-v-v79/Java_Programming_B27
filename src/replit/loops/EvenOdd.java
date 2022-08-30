package replit.loops;

public class EvenOdd {
    public static void main(String[] args) {
        int odd = -1;
        int even = 0;
        String str  = " ";
        for (int i = 0; even < 20; i++) {
            System.out.print(even += 2);
            if(even <= 18)
                System.out.print(str);
        }
        System.out.println();
        for (int i = 0; odd < 19; i++) {
            System.out.print(odd += 2);
            if (odd <= 17)
                System.out.print(" ");
        }
    }
}
