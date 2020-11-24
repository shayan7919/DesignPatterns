package ir.ac.kntu.Decorator.coffeeShop;

public class DarkRoast implements Item {
    private final String name;

    public DarkRoast() {
        name = "Dark Roast";
    }

    @Override
    public double cost() {
        return 7.7;
    }
}
