package ir.ac.kntu.Observer.Mail;

public class Main {
    public static void main(String[] args) {
        Subject subject = new EmailSubject();
        Observer observer = new Subscriber("first");
        Observer observer1 = new Subscriber("second");
        Observer observer2 = new Subscriber("third");
        subject.register(observer);
        subject.register(observer1);
        subject.register(observer2);
        subject.setState("Hey");
        subject.getObservers().forEach((o) -> System.out.println(o.getMessage()));
        subject.unregister(observer1);
        subject.getObservers().forEach((o) -> System.out.println(o.getMessage()));
    }
}
