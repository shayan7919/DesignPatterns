package ir.ac.kntu.Strategy.Store;

public class Product {
    private String name;
    private long ubcCode;
    private boolean isPayed;

    public Product(String name, long ubcCode) {
        this.name = name;
        this.ubcCode = ubcCode;
    }

    public void setPayed(boolean isPayed) {
        this.isPayed = isPayed;
    }
}
