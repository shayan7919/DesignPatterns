package ir.ac.kntu.Adaptor.Player;

public class Main {
    public static void main(String[] args) {
        MediaPlayer player = new Player();
        AdvanceMp4Player mp4Player = new Mp4Player();
        AdvanceVlcPlayer vlcPlayer = new VlcPlayer();

        String name = "Abr mibarad";

        player.play("mp3", name);
        mp4Player.playMp4(name);
        vlcPlayer.playVlc(name);
    }
}
