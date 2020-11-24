package ir.ac.kntu.Pacman;


public class PacMan implements Movable {
    private final MyMap map;
    private boolean alive;
    private int coins;

    public PacMan(MyMap map) {
        this.alive = true;
        this.coins = 0;
        this.map = map;
    }

    /**
     * PacMan moves with  W-A-S-D
     */

    public void move() {
        Move move = new Move(map);
        switch (Sc.nextChar()) {
            case 'a':
                move.left(this);
                break;
            case 's':
                move.down(this);
                break;
            case 'd':
                move.right(this);
                break;
            case 'w':
                move.up(this);
                break;
            default:
        }
        if (!alive) {
            System.out.println("Score " + coins);
            System.exit(0);
        }
    }

    public void whatHappened(Movable movable) {
        if (movable.getClass() == Ghost.class) {
            System.out.println("Game over");
            this.alive = false;
        } else if (movable.getClass() == Coin.class) {
            this.coins++;
        }
    }

    public MyMap getMap() {
        return map;
    }

    @Override
    public String toString() {
        return "P";
    }
}
