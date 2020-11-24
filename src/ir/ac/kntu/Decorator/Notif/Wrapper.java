package ir.ac.kntu.Decorator.Notif;

public class Wrapper implements Notif {
    Notif notif;

    public Wrapper(Notif notif) {
        this.notif = notif;
    }

    public Wrapper() {
        notif = new EmailNotif();
    }

    @Override
    public String send(String message) {
        return this.notif.send(message);
    }
}
