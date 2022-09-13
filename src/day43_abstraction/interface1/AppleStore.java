package day43_abstraction.interface1;

import day43_abstraction.interface1_iml.Desktop;

public class AppleStore {
    public static void main(String[] args) {
        System.out.println(Mac.brand);
        System.out.println(Mac.os);
        Mac.getBrand();

        Desktop desktop = new Desktop();
        desktop.turnOn();
        desktop.typing();
    }
}
