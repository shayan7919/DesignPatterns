package ir.ac.kntu.Observer.Mail;

public class Subscriber implements Observer {
    private String name;
    private Subject subject;
    private String message;

    public Subscriber(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public void update() {
        message = subject.getState() + " " + name;
    }

    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
