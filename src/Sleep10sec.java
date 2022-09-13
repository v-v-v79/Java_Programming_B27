public class  Sleep10sec {

    static void sleep10sec() /*throws InterruptedException*/{
        //Thread.sleep(3000);
        System.out.println("Sleep for 3 seconds");
        throw new ArithmeticException("Program was interrupted for 3 seconds");
    }

    public static void main(String args[]) {
        //try {
            sleep10sec();
        //} catch (InterruptedException e) {
            //e.printStackTrace();
        //}
    }
}
