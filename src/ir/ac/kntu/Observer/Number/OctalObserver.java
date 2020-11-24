package ir.ac.kntu.Observer.Number;

public class OctalObserver extends Observer {

    public OctalObserver() {
        setName("Octal");
    }

    @Override
    public void update() {
        setNumber(Integer.toOctalString(getSubject().getState()));
    }
}
