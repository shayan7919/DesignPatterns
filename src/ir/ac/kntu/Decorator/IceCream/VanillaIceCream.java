package ir.ac.kntu.Decorator.IceCream;

public class VanillaIceCream extends IceCreamDecorator {
    public VanillaIceCream(IceCream iceCream) {
        super(iceCream);
        this.setName("Vanilla");
        this.setExtraCost(1);
    }

    public VanillaIceCream() {
        this.setName("Vanilla");
        this.setExtraCost(1);
    }

    @Override
    public double cost() {
        return super.cost() + this.getExtraCost();
    }
}
