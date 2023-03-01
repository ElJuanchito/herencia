package co.edu.uniquindio.model;

public class Labrador extends Dog {
    String origin;

    public Labrador(String name, int age, String Color, String breed, String origin) {
        super(name, age, Color, breed);
        this.origin = origin;
    }
}
