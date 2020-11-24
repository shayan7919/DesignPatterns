package ir.ac.kntu.Factory.Pizza;

public class NyStylePeperoniPizza implements NyPizzaStore {
    @Override
    public void createPizza() {
        System.out.println("Creating NyStyle peperoni pizza");
    }
}
