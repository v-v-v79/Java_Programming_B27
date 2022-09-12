package day43_abstraction.interface1_iml;

import day43_abstraction.interface1.Mac;

public class Desktop implements Mac {

    @Override
    public void turnOn() {
        System.out.println("Desktop is turning on");
    }
}
