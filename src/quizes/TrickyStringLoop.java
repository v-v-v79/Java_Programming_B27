package quizes;

public class TrickyStringLoop {

    public static void main(String[] args) {
        String str = "hello";
        for (int i = 0; i < str.length() - 1; i++){
            System.out.println(str.substring(i, i + 2));
        }
    }
}
