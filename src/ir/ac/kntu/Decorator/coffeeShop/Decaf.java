package ir.ac.kntu.Decorator.coffeeShop;

public class Decaf implements Item {
    private final String name;

    public Decaf() {
        this.name = "DeCaf";
    }

    @Override
    public double cost() {
        return 3.5;
    }
}
