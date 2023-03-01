package co.edu.uniquindio.model;

public class Mammal extends Animal {
    String Color;

    public Mammal(String name, int age, String furColor) {
        super(name, age);
        this.Color = furColor;
    }

    public void walk() {
        System.out.println(name + " is walking.");
    }
}