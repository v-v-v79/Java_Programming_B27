package day51_stream;

import java.util.Arrays;

public class FilterApplications {
    public static void main(String[] args) {
        Application[] apps = {
                new Application("Jose Penso", 150_000, true),
                new Application("Ostap Koziak", 1800_000, true),
                new Application("Oksana Abramyan", 250_000, true),
                new Application("Bursa Yagiz", 130_000, true),
                new Application("Orkhan Samadzade", 170_000, true),
        };

        System.out.println(Arrays.stream(apps).filter(person -> person.willingToRelocate).toList());
        System.out.println(Arrays.stream(apps).filter(person -> person.willingToRelocate).map(p -> p.name).toList());
        System.out.println(Arrays.stream(apps).filter(Application::isWillingToRelocate).map(Application::getName).toList());
        System.out.println(Arrays.stream(apps).filter(p -> p.expectedSalary >= 180_000).map(Application::getName).toList());
    }
}

class Application {
    String name;
    double expectedSalary;
    boolean willingToRelocate;

    public Application(String name, double expectedSalary, boolean willingToRelocate) {
        this.name = name;
        this.expectedSalary = expectedSalary;
        this.willingToRelocate = willingToRelocate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExpectedSalary(double expectedSalary) {
        this.expectedSalary = expectedSalary;
    }

    public void setWillingToRelocate(boolean willingToRelocate) {
        this.willingToRelocate = willingToRelocate;
    }

    public String getName() {
        return name;
    }

    public double getExpectedSalary() {
        return expectedSalary;
    }

    public boolean isWillingToRelocate() {
        return willingToRelocate;
    }

    @Override
    public String toString() {
        return "Application{" +
                "name='" + name + '\'' +
                ", expectedSalary=" + expectedSalary +
                ", willingToRelocate=" + willingToRelocate +
                '}';
    }
}