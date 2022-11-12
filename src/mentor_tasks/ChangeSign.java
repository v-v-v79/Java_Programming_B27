package mentor_tasks;

public class ChangeSign {
    public static void main(String[] args) {
        System.out.println(reverse(-523));
    }

    public static int reverse(int negative) {
        return negative > 0 ? negative : negative < 0 ? -negative : 0;
    }
}

