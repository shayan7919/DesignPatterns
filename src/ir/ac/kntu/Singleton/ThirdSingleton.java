package ir.ac.kntu.Singleton;

public class ThirdSingleton {
    public static final ThirdSingleton THIRD_SINGLETON = new ThirdSingleton();

    private ThirdSingleton() {

    }

    public static ThirdSingleton getInstance() {
        return THIRD_SINGLETON;
    }
}
