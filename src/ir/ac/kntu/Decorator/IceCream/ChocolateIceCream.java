package ir.ac.kntu.Decorator.IceCream;

public class ChocolateIceCream extends IceCreamDecorator {

    public ChocolateIceCream(IceCream iceCream) {
        super(iceCream);
        this.setExtraCost(2);
        this.setName("Chocolate");
    }

    public ChocolateIceCream() {
        this.setExtraCost(2);
        this.setName("Chocolate");
    }

    @Override
    public double cost() {
        return super.cost() + this.getExtraCost();
    }
}
