package class_meetings;

public class TrickySum {
    public static int sum(int a, int b) {
        if(a + b > 1)
            return 0;
        System.out.println(a + b);
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, sum(0, 1)));
    }
}
