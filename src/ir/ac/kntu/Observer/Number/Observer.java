package ir.ac.kntu.Observer.Number;

public abstract class Observer {
    private String name;
    private String number;
    private Subject subject;


    public abstract void update();

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return name + ": " + number;
    }
}
