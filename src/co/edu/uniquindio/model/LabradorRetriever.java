package co.edu.uniquindio.model;

public class LabradorRetriever extends Dog {
    String origin;

    public LabradorRetriever(String name, int age, String Color, String breed, String origin) {
        super(name, age, Color, breed);
        this.origin = origin;
    }
}
