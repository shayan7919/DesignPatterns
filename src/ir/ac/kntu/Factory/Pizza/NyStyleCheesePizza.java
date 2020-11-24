package ir.ac.kntu.Factory.Pizza;

public class NyStyleCheesePizza implements NyPizzaStore {
    @Override
    public void createPizza() {
        System.out.println("Creating ny cheese pizza");
    }
}
