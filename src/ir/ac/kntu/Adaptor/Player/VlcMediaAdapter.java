package ir.ac.kntu.Adaptor.Player;

public class VlcMediaAdapter implements MediaPlayer {
    AdvanceVlcPlayer vlcPlayer;

    @Override
    public void play(String type, String name) {
        vlcPlayer.playVlc("name");
    }
}
