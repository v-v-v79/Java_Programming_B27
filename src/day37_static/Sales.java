package day37_static;

public class Sales {

    String name;
    String city;
    Computer computer;

    public static String role;
    public static boolean wearStoreT_short;
    public static boolean hasBadge;

    static {
        role = "Sales";
        wearStoreT_short = true;
        hasBadge = true;
    }
    public static void says() {
        System.out.println("Hello, how could help you?");
    }
    public static void introduce() {
        System.out.println("I am " + role);
    }
    public static void offers() {
        System.out.println("I can show you what we have");
    }

    public Sales(String name, String brand, String color) {
        this.name = name;
        computer = new Computer(brand, color);
    }
}


