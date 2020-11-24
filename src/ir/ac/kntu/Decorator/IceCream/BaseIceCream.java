package ir.ac.kntu.Decorator.IceCream;

public class BaseIceCream implements IceCream {
    private double baseCost;
    private final String name;

    public BaseIceCream() {
        name = "Simple";
        baseCost = 5;
    }

    @Override
    public double cost() {
        return baseCost;
    }
}
