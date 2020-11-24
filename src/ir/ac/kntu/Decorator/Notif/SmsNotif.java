package ir.ac.kntu.Decorator.Notif;

public class SmsNotif extends Wrapper {

    public SmsNotif(Notif notif) {
        super(notif);
    }

    public SmsNotif() {
        super();
    }

    @Override
    public String send(String message) {
        return "Via Sms and " + notif.send(message);
    }
}

