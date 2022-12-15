package mentor_tasks;

public class JoinArrays {
    public static void main(String[] args) {
        char[] arr1 = {'a', 'b', 'c'};
        char[] arr2 = {'d', 'e', 'f'};
        char[] arr3 = joinArrays(arr1, arr2);
        for (int each : arr3) {
            System.out.print((char)each + " ");
        }
    }

    public static char[] joinArrays(char[] arr1, char[] arr2) {
        char[] arr3 = new char[arr1.length + arr2.length];
        int i = 0;
        for (char each : arr1) {
            arr3[i] = each;
            i++;
        }
        for (char each : arr2) {
            arr3[i] = each;
            i++;
        }
        return arr3;
    }
}

