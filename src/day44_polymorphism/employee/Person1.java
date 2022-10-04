package day44_polymorphism.employee;

public class Person1 {
    public String name;
    public int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person1(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
