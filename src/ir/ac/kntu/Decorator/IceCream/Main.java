package ir.ac.kntu.Decorator.IceCream;

public class Main {
    public static void main(String[] args) {
        IceCream iceCream = new BaseIceCream();

        IceCream vanilla = new VanillaIceCream();

        IceCream chocolate = new ChocolateIceCream(vanilla);


    }
}
