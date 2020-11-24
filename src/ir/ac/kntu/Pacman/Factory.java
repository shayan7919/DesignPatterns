package ir.ac.kntu.Pacman;

public class Factory {
    public static Movable getMovable(Type type) {
        switch (type) {
            case COIN:
                return new Coin();
            case GHOST:
                return new Ghost();
            case NOTHING:
                return new Nothing();
            default:
                return null;
        }
    }

    public enum Type {
        COIN, GHOST, NOTHING
    }
}
