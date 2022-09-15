package day44_polymorphism.animal;

public class Wild {
    public static void main(String[] args) {
        Lizard lizard1 = new Lizard();
        Reptile lizard2 = new Lizard();
        Animal lizard3 = new Lizard();

        lizard1.eat();
        lizard2.eat();
        lizard3.eat();
    }
}
