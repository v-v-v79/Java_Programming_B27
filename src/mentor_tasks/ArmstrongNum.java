package mentor_tasks;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(isArmstrong(num));
    }

    public static boolean isArmstrong(int num) {
        String numStr = num + "";
        String arr[] = numStr.split("");
        int[] arrNum = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrNum[i] = parseInt(arr[i]);
        }
        int res = 0;
        for (int i : arrNum) {
            res += Math.pow(i, 3);
        }
        System.out.println(res);
        if(res == num)
            return true;
        else 
            return false;
    }
}
