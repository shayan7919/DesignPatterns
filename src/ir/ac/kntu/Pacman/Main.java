package ir.ac.kntu.Pacman;

public class Main {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        MyMap map = new MyMap(10);
        PacMan pacMan = new PacMan(map);
        pacMan.getMap().setPacMan(Location.getRandom(10), pacMan);
        while (true) {
            pacMan.getMap().show();
            pacMan.move();
        }
    }
}
