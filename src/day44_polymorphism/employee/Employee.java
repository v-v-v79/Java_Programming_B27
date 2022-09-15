package day44_polymorphism.employee;

public abstract class Employee extends Person {

    String jobTitle;
    double salary;

    public Employee(String name, String jobTitle) {
        super(name);
        this.jobTitle = jobTitle;
    }
}
