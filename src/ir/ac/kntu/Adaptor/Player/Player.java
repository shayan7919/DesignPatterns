package ir.ac.kntu.Adaptor.Player;

public class Player implements MediaPlayer {
    @Override
    public void play(String type, String name) {
        System.out.println("Playing " + name + " with " + type + " format");
    }
}
