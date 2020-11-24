package ir.ac.kntu.Command.GameBoy;

public class Console {
    private Command up;
    private Command down;
    private Command right;
    private Command left;
    private Command shoot;

    public Console() {
        up = new NoCommand();
        down = new NoCommand();
        right = new NoCommand();
        left = new NoCommand();
    }

    public void setUp(Command up) {
        this.up = up;
    }

    public void setDown(Command down) {
        this.down = down;
    }

    public void fire(Command shoot) {
        this.shoot = shoot;
    }

    public void setRight(Command right) {
        this.right = right;
    }

    public void setLeft(Command left) {
        this.left = left;
    }

    public void setAll(Command up, Command down, Command right, Command left) {
        this.up = up;
        this.down = down;
        this.right = right;
        this.left = left;
    }

    public void pressUp() {
        up.execute();
    }

    public void pressDown() {
        down.execute();
    }

    public void pressRight() {
        right.execute();
    }

    public void pressFire() {
        shoot.execute();
    }

    public void pressLeft() {
        left.execute();
    }
}
