package ir.ac.kntu.Observer.Mail;

import java.util.ArrayList;
import java.util.List;

public class EmailSubject implements Subject {
    private String message;
    private final List<Observer> observers;

    public EmailSubject() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if (observer != null && !observers.contains(observer)) {
            observers.add(observer);
            observer.setSubject(this);
        }
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    @Override
    public void setState(String message) {
        this.message = message;
        notifyObservers();
    }


    @Override
    public String getState() {
        return message;
    }

    public List<Observer> getObservers(){
        return new ArrayList<>(observers);
    }
}
