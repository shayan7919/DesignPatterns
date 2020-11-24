package ir.ac.kntu.Observer.Number;

import java.util.ArrayList;
import java.util.List;

public class Provider implements Subject {
    private final List<Observer> observers;
    private int number;

    public Provider() {
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
    public void unRegister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public void setState(int number) {
        this.number = number;
        notifyObserver();
    }

    @Override
    public int getState() {
        return number;
    }

    public List<Observer> getObservers() {
        return new ArrayList<>(observers);
    }
}
