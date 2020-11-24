package ir.ac.kntu.Decorator.Notif;

public class Main {
    public static void main(String[] args) {
        Notif notif = new SmsNotif(new FaceBookNotif(new EmailNotif()));
        System.out.println(notif.send("message"));
    }
}
