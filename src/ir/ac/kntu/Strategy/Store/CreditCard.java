package ir.ac.kntu.Strategy.Store;

public class CreditCard implements PayStrategy {
    @Override
    public void pay(Product product) {
//        throw new UnsupportedOperationException();
            product.setPayed(true);
        System.out.println("Payed by Credit card");
    }
}
