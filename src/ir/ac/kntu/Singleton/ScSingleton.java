package ir.ac.kntu.Singleton;

import java.util.Scanner;

public class ScSingleton {
    public static final Scanner SC = new Scanner(System.in);

    private ScSingleton() {

    }

    public static Scanner getInstance() {
        return SC;
    }
}
