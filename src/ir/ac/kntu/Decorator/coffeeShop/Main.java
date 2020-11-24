package ir.ac.kntu.Decorator.coffeeShop;

public class Main {
    public static void main(String[] args) {
        Item item = new Soy(new Espresso());
        System.out.println(item.cost());

        Item secondItem = new DarkRoast();
        secondItem = new Soy(secondItem);
        secondItem = new Mocha(secondItem);
        secondItem = new Milk(secondItem);

        System.out.println(secondItem.cost());
        Item third = new Milk(new Mocha(new Soy(new DarkRoast())));
        System.out.println(third.cost());
    }
}
