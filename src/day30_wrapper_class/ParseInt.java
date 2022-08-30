package day30_wrapper_class;

public class ParseInt {

    public static void main(String[] args) {

        String str = "My salary is $350000.00 a year";
        double salary = Double.parseDouble(str.split(" ")[3].substring(1));
        System.out.println(salary);
    }
}
