package ir.ac.kntu.Adaptor.Player;

public class VlcPlayer implements AdvanceVlcPlayer {

    @Override
    public void playVlc(String name) {
        System.out.println("Play " + name + " with Vlc format");
    }
}
