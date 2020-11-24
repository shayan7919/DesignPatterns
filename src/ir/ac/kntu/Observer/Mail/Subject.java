package ir.ac.kntu.Observer.Mail;

import java.util.List;

public interface Subject {
    void register(Observer observer);

    void unregister(Observer observer);

    void notifyObservers();

    void setState(String string);

    String getState();

    List<Observer> getObservers();
}
