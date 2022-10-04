package day_49_functional_interface_lambda_exp;

public class ReadInfo {
    public static void main(String[] args) {
        System.out.println(ConfigReader.getProperty("day"));
        System.out.println(ConfigReader.getProperty("browser"));
        System.out.println(ConfigReader.getProperty("topic"));
    }
}
