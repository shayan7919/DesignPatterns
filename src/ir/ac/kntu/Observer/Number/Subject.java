package ir.ac.kntu.Observer.Number;

import java.util.List;

public interface Subject {
    void register(Observer observer);

    void unRegister(Observer observer);

    void notifyObserver();

    void setState(int number);

    int getState();

    List<Observer> getObservers();

}
