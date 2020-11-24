package ir.ac.kntu.Command.GameBoy;

public class MarioCharacter implements Character {

    @Override
    public void up() {
        System.out.println("Jump Mario ...");
    }

    @Override
    public void down() {
        System.out.println("Seat Mario ...");
    }
    @Override
    public void right() {
        System.out.println("Forward Mario ...");
    }
    @Override
    public void left() {
        System.out.println("backward Mario ...");
    }
}
