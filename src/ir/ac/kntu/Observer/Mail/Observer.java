package ir.ac.kntu.Observer.Mail;

public interface Observer {

    void update();

    void setSubject(Subject subject);

    String getMessage();
}
