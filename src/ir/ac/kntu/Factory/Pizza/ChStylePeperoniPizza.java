package ir.ac.kntu.Factory.Pizza;

public class ChStylePeperoniPizza implements ChPizzaStore{
    @Override
    public void createPizza() {
        System.out.println("Creating ChStyle peperoni pizza");
    }
}
