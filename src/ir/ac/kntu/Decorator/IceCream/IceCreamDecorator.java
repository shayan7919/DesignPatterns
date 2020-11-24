package ir.ac.kntu.Decorator.IceCream;

public abstract class IceCreamDecorator implements IceCream {

    private IceCream iceCream;
    private double extraCost;
    private String name;

    public IceCreamDecorator() {
        iceCream = new BaseIceCream();

    }

    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }


    public void setExtraCost(double extraCost) {
        this.extraCost = extraCost;
    }

    public double getExtraCost() {
        return extraCost;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public double cost() {
        return iceCream.cost();
    }

    @Override
    public String toString() {
        return name + " iceCream costs " + cost();
    }
}
