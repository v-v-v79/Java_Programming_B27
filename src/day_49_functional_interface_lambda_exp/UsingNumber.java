package day_49_functional_interface_lambda_exp;

public class UsingNumber{
    public static void main(String[] args) {
        NumberInterface evenOdd = (n) -> {
           String res = n % 2 == 0 ? "Even" : "Odd";
            System.out.println(res);
        };
        evenOdd.test(5);
        evenOdd.test(10);

        //Parenthesis and curly brackets are not needed
        // because we have only one parameter and one statement.
        NumberInterface cube = n ->
                System.out.println(n * n * n);
        cube.test(5);
    }
}
