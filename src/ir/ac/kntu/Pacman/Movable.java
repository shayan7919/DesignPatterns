package ir.ac.kntu.Pacman;

public interface Movable {

}

class Coin implements Movable {
    @Override
    public String toString() {
        return "$";
    }
}

class Ghost implements Movable {
    @Override
    public String toString() {
        return "O";
    }
}

class Nothing implements Movable {
    @Override
    public String toString() {
        return "#";
    }
}
