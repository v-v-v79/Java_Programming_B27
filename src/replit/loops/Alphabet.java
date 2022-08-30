package replit.loops;

public class Alphabet {
    public static void main(String[] args) {
        char leterA = 'A';
        char letterz = 'z';
        for (int i = 0; i < 26; i++){
            System.out.print(leterA++);
        }
        System.out.println();
        for (int i = 0; i < 26; i++){
            System.out.print(letterz--);
        }
    }
}
