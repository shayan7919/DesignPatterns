package ir.ac.kntu.Decorator.coffeeShop;

public class Soy extends ItemDecorator {
    public Soy(Item item) {
        super(item);
    }

    @Override
    public double cost() {
        return super.cost() + 2;
    }
}
