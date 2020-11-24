package ir.ac.kntu.Strategy.Store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products;
    private PayStrategy strategy;

    public Store(PayStrategy strategy) {
        products = new ArrayList<>();
        this.strategy = strategy;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void payAll() {
        for (Product product : products) {
//            strategy = (product1) -> System.out.println("Pay in lambda");
            strategy.pay(product);
        }
    }
}
