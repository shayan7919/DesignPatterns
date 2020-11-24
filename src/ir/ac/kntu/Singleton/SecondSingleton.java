package ir.ac.kntu.Singleton;

public class SecondSingleton {
    private static SecondSingleton singleton;

    private SecondSingleton() {

    }

    public synchronized static SecondSingleton getInstance() {
        if (singleton == null) {
            singleton = new SecondSingleton();
        }
        return singleton;
    }
}
