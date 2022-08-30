package day36_custom_classes.food;

import java.util.ArrayList;
import java.util.Arrays;

public class HobbyChecker {

    public static void printHobbies(ArrayList<Hobby> list) {
        for (Hobby each: list)
            Hobby.doIt(each);
    }
    public static ArrayList<Hobby> inDoors(ArrayList<Hobby> list) {
        ArrayList<Hobby> list1 = new ArrayList<>();
        for (Hobby each: list){
            if(!each.isOutdoor)
                list1.add(each);
        }
        return list1;
    }
    public static ArrayList<Hobby> others(ArrayList<Hobby> list) {
        ArrayList<Hobby> list1 = new ArrayList<>();
        for (Hobby each: list){
            if(!each.requiresOthers)
                list1.add(each);
        }
        return list1;
    }
    public static ArrayList<Hobby> coastMore500(ArrayList<Hobby> list) {
        ArrayList<Hobby> list1 = new ArrayList<>();
        for (Hobby each: list){
            if(each.annCost <= 500.00)
                list1.add(each);
        }
        return list1;
    }

    public static void main(String[] args) {

        Hobby hobby1 = new Hobby("wakeboarding", 3000.00, true, false);
        Hobby hobby2 = new Hobby("fishing", 4000.00, true, false);
        Hobby hobby3 = new Hobby("chess", 300.00, false, true);
        Hobby hobby4 = new Hobby("gaming", 5000.00, false, true);

        ArrayList<Hobby> list = new ArrayList<>(Arrays.asList(hobby1, hobby2, hobby3, hobby4));
        printHobbies(list);
        System.out.println();
        System.out.println("Indoors:");
        ArrayList<Hobby> list1 = inDoors(list);
        for (Hobby each: list1)
            System.out.println(each);
        System.out.println();
        ArrayList<Hobby> list2 = others(list);
        for (Hobby each: list2)
            System.out.println(each);
        System.out.println();
        ArrayList<Hobby> list3 = coastMore500(list);
        for (Hobby each: list3)
            System.out.println(each);
        System.out.println();
    }
}
