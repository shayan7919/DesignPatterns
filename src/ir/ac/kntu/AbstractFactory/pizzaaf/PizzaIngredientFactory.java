package ir.ac.kntu.AbstractFactory.pizzaaf;

public interface PizzaIngredientFactory {

    public Dough createDough();

    Sauce createSauce();

    public Cheese createCheese();

    Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();

}
