package ir.ac.kntu.Decorator.coffeeShop;

public abstract class ItemDecorator implements Item {
    Item item;

    public ItemDecorator(Item item) {
        this.item = item;
    }

    @Override
    public double cost() {
        return item.cost();
    }
}
