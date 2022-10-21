package mentor_tasks;

import java.util.Scanner;

public class CodilityTestCoders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N < 0) {
            return;
        }
        for (int i = 1; i < N + 1; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0)
                System.out.println("CodilityTestCoder");
            else if (i % 2 == 0 && i % 3 == 0)
                System.out.println("CodilityTest");
            else if (i % 2 == 0)
                System.out.println("Codility");
            else if (i % 3 == 0)
                System.out.println("Test");
            else if (i % 5 == 0)
                System.out.println("Coders");
            else
                System.out.println(i);
        }
    }
}
