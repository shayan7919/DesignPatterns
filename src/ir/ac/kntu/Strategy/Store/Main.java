package ir.ac.kntu.Strategy.Store;

public class Main {
    public static void main(String[] args) {
        Store store = new Store(new PayPal());
        store.addProduct(new Product("Calculator", 12155));
        store.addProduct(new Product("Phone", 84242787));
        store.addProduct(new Product("Laptop", 34204057));
        store.payAll();
        System.out.println("=======================");
        store = new Store(new CreditCard());
        store.addProduct(new Product("Calculator", 12155));
        store.addProduct(new Product("Phone", 84242787));
        store.addProduct(new Product("Laptop", 34204057));
        store.payAll();
        System.out.println("=======================");
    }
}
