package ir.ac.kntu.Decorator.Notif;

/*
    This is Base Notif
 */
public class EmailNotif implements Notif {

    @Override
    public String send(String message) {
        return "Via Email " + message;
    }
}
