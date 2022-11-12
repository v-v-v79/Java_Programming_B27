package mentor_tasks;

public class RemoveDuplicates extends BaseClass {
    public static void main(String[] args) {
        String str = BaseClass.scanner.nextLine();
        System.out.println(removeDuplicates(str));
    }

    public static String removeDuplicates(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            res += str.charAt(i) + "";
            if (str.substring(i).contains(str.charAt(i) + "")) {
                str = str.replaceAll(str.charAt(i) + "", "");
                i--;
            }
        }
        return res;
    }
}
