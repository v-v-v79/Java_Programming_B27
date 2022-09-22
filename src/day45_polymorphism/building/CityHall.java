package day45_polymorphism.building;

import java.util.ArrayList;

public class CityHall {
    public static void main(String[] args) {
        Building house = new House("Castaic", 2_000_000, 4);
        Building office = new OfficeBuilding("LA", 7_000_000, 2);
        Building apt = new Apartment("Van Nuys", 700_000, 12);

        ArrayList<Building> list = new ArrayList<>();
        list.add(house);
        list.add(office);
        list.add(apt);

        for (Building each: list) {
            if(each.location.equals("Castaic")) {
                System.out.println(each);
                house.pay();
                ((House)house).mowLawn();
                System.out.println();
            }
        }
        for (Building each: list) {
            if (each.location.contains("LA")) {
                System.out.println(office);
                office.pay();
                ((OfficeBuilding)office).elevator();
                System.out.println();
            }
        }
        for(Building each: list) {
            if(each.location.contains("Van")) {
                System.out.println(apt);
                apt.pay();
                ((Apartment)apt).openBalcony();
                System.out.println();
            }
        }

    }
}
