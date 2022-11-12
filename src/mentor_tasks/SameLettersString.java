package mentor_tasks;

public class SameLettersString extends BaseClass {

    public static void main(String[] args) {
        String str1 = BaseClass.scanner.nextLine();
        String str2 = BaseClass.scanner.nextLine();
        System.out.println(areSameLetters(str1, str2));
    }

    public static boolean areSameLetters(String str1, String str2) {
        if (!(str1.length() == str2.length()))
            return false;
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    count++;
                    str2 = str2.replace(str2.charAt(j) + "", "");
                    break;
                }
            }
        }
        return count == str1.length();
    }
}
