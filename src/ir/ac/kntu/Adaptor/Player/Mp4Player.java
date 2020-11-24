package ir.ac.kntu.Adaptor.Player;

public class Mp4Player implements AdvanceMp4Player {
    @Override
    public void playMp4(String name) {
        System.out.println("Play " + name + " with mp4 format");
    }
}
