package ir.ac.kntu.Singleton;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FirstSingleton firstSingleton = FirstSingleton.getInstance();
        SecondSingleton secondSingleton = SecondSingleton.getInstance();
        ThirdSingleton thirdSingleton = ThirdSingleton.getInstance();
        FourthSingleton fourthSingleton = FourthSingleton.getInstance();
        Scanner sc = ScSingleton.getInstance();

    }

}
