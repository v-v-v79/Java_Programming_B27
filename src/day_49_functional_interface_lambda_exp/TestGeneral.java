package day_49_functional_interface_lambda_exp;

public class TestGeneral {
    public static void main(String[] args) {
        GeneralInterface<Integer> validYear = (year) -> {
            String res = year <= 2022 ? "Valid year" : "Not valid year";
        };
        validYear.test(2023);
    }
}
