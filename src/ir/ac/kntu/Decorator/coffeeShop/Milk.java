package ir.ac.kntu.Decorator.coffeeShop;

public class Milk extends ItemDecorator {
    public Milk(Item item) {
        super(item);
    }

    @Override
    public double cost() {
        return super.cost() + 2.4;
    }
}
