package day36_custom_classes.food;

public class Offer {

    String name;
    String location;
    String position;
    Double salary;
    Boolean isFullTime;

    public Offer(){
    }
    public Offer(String name, String location, String position, Double salary, Boolean isFullTime) {
        this.name = name;
        this.location = location;
        this.position = position;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }
    @Override
    public String toString() {
        return "Offer{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
