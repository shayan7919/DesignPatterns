package ir.ac.kntu.Strategy.Store;

public class PayPal implements PayStrategy {
    @Override
    public void pay(Product product) {
        product.setPayed(true);
        System.out.println("Pay with PayPal");
    }
}
