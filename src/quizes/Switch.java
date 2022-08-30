package quizes;

public class Switch {
    public static void main(String[] args) {
        int n = 0;

        String[] days = {"sun", "mon", "wed", "sat"};

        for(int i = 0; i < days.length; i++) {

            switch (days[i]) {
                case "sat":
                case "sun":
                    n++;
                    break;
                case "mon":
                    n += 5;
                    break;
                case "wed":
                    n -= 2;
            }
        }
    }
}
