package ir.ac.kntu.Singleton;

public class FirstSingleton {
    private static FirstSingleton singleton;

    private FirstSingleton() {

    }

    public static FirstSingleton getInstance() {
        if (singleton == null) {
            singleton = new FirstSingleton();
        }
        return singleton;
    }

}
