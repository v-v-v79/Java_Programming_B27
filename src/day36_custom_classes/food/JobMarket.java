package day36_custom_classes.food;

import java.util.ArrayList;
import java.util.Arrays;

public class JobMarket {

    public static ArrayList<Offer> localOffers(ArrayList<Offer> offers) {
        ArrayList<Offer> list = new ArrayList<>();
        for (Offer each: offers) {
            if (each.location.equals("LA"))
                list.add(each);
        }
        return list;
    }
    public static ArrayList<Offer> testerOffers(ArrayList<Offer> offers) {
        ArrayList<Offer> list = new ArrayList<>();
        for (Offer each: offers) {
            if (each.position.equalsIgnoreCase("SDET") ||
                    each.position.equalsIgnoreCase("QA"))
                list.add(each);
        }
        return list;
    }
    public static ArrayList<Offer> goodSalary(ArrayList<Offer> offers) {
        ArrayList<Offer> list = new ArrayList<>();
        for (Offer each: offers) {
            if (each.salary >= 100_000.00)
                list.add(each);
        }
        return list;
    }
    public static ArrayList<Offer> fullTime(ArrayList<Offer> offers) {
        ArrayList<Offer> list = new ArrayList<>();
        for (Offer each: offers) {
            if (each.isFullTime)
                list.add(each);
        }
        return list;
    }


    public static void main(String[] args) {

        Offer productOwner = new Offer("ITDeals", "LA", "PO", 180000.00, true);
        Offer sDet = new Offer("ITDeals", "LA", "SDET", 150000.00, true);
        Offer qA = new Offer("ITDeals", "Boston", "QA", 90000.00, false);
        Offer developer = new Offer("ITDeals", "Seattle", "developer", 160000.00, true);
        Offer designer = new Offer("ITDeals", "Austin", "designer", 170000.00, false);

        ArrayList<Offer> offerList = new ArrayList<>(Arrays.asList(productOwner, sDet, qA, developer, designer));

        System.out.println("Local offers:");
        ArrayList<Offer> list1 = localOffers(offerList);
       for (Offer each: list1)
           System.out.println(each);

        System.out.println("Tester offers:");
       ArrayList<Offer> list2 = testerOffers(offerList);
       for (Offer each: list2)
           System.out.println(each);

        System.out.println("Good salary: ");
       ArrayList<Offer> list3 = goodSalary(offerList);
       for (Offer each: list3)
           System.out.println(each);

        System.out.println("Full time:");
       ArrayList<Offer> list4 = fullTime(offerList);
       for (Offer each: list4)
           System.out.println(each);
    }
}
