package ir.ac.kntu.Decorator.Notif;

public class FaceBookNotif extends Wrapper {

    public FaceBookNotif(Notif notif) {
        super(notif);
    }

    public FaceBookNotif() {
    }

    @Override
    public String send(String message) {
        return "Via Facebook and " + notif.send(message);
    }
}
