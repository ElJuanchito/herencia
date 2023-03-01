package co.edu.uniquindio.model;

public class Dog extends Mammal {
    String breed;

    public Dog(String name, int age, String Color, String breed) {
        super(name, age, Color);
        this.breed = breed;
    }
}
