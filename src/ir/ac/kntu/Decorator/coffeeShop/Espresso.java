package ir.ac.kntu.Decorator.coffeeShop;

public class Espresso implements Item {
    public final String name;

    public Espresso() {
        name = "Espresso";
    }


    @Override
    public double cost() {
        return 4.1;
    }
}
