package ir.ac.kntu.Decorator.coffeeShop;

public class Mocha extends ItemDecorator {
    public Mocha(Item item) {
        super(item);
    }

    @Override
    public double cost() {
        return super.cost() + 3.4;
    }
}
