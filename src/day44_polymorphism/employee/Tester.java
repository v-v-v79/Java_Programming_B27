package day44_polymorphism.employee;

public class Tester extends Employee implements CreateSmokeTest {

    public Tester(String name, String jobTitle, double salary) {
        super(name, jobTitle, salary);
    }
    @Override
    public void work() {
        System.out.println("running test cases");
    }

    @Override
    public void ceate() {
        System.out.println("Creating automatic test");
    }

    public void writingBugReport() {
        System.out.println("Found bug, writing bug report");
    }
}
