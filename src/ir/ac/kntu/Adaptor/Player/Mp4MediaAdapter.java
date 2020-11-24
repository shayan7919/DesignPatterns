package ir.ac.kntu.Adaptor.Player;

public class Mp4MediaAdapter implements MediaPlayer {
    AdvanceMp4Player mp4Player;

    @Override
    public void play(String type, String name) {
        mp4Player.playMp4(name);
    }
}
