package day_50_functional_innerface_lambda_pactice;

import day34_custom_classes.Student;
import day44_polymorphism.employee.Person;
import day44_polymorphism.employee.Person1;

import java.util.HashMap;
import java.util.Map;

public class WithMapEG {
    public static void main(String[] args) {
        Map<Integer, Person1> classRoom = new HashMap<>(Map.of(
                1, new Person1("James", 35),
                2, new Person1("Anna", 25),
                3, new Person1("Linda", 23)
                ));
        System.out.println("classRoom = " + classRoom);
        classRoom.forEach((key, value) ->System.out.println("Key " + key + " Value " + value));
        // oldest person
        final int[] oldest = {0};
        classRoom.forEach((k, v) -> {
            if(v.age > oldest[0])
                oldest[0] = v.age;
        });
        System.out.println("oldest[0] = " + oldest[0]);
    }
}
