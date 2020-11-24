package ir.ac.kntu.Pacman;

import java.util.Scanner;

public class Sc {
    private final static Scanner SC = new Scanner(System.in);

    private Sc() {
    }

    public static Scanner getInstance() {
        return SC;
    }

    public static char nextChar() {
        return SC.nextLine().toLowerCase().charAt(0);
    }

}
