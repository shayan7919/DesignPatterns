package ir.ac.kntu.Factory.Pizza;

public class ChStyleCheesePizza implements ChPizzaStore {
    @Override
    public void createPizza() {
        System.out.println("creating ChStyle cheese pizza");
    }
}
