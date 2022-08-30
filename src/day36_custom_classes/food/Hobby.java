package day36_custom_classes.food;

public class Hobby {

    String name;
    Double annCost;
    Boolean isOutdoor;
    Boolean requiresOthers;

    public Hobby(String name, Double annCost, Boolean isOutdoor, Boolean requiresOthers) {
        this.name = name;
        this.annCost = annCost;
        this.isOutdoor = isOutdoor;
        this.requiresOthers = requiresOthers;
    }
    public static void doIt(Hobby hobby) {
        String inDoor = "";
        if (hobby.isOutdoor)
            inDoor += " outside";
        else
            inDoor += " inside";
        System.out.println("Doing " + hobby.name + inDoor);

    }
    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", annCost=" + annCost +
                ", isOutdoor=" + isOutdoor +
                ", requiresOthers=" + requiresOthers +
                '}';
    }
}
