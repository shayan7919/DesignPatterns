package ir.ac.kntu.Singleton;

public class FourthSingleton {
    private volatile static FourthSingleton singleton;

    private FourthSingleton() {

    }

    public static FourthSingleton getInstance() {
        if (singleton == null) {
            synchronized (FourthSingleton.class) {
                if (singleton == null) {
                    singleton = new FourthSingleton();
                }
            }
        }
        return singleton;
    }
}
