package ir.ac.kntu.Observer.Number;

public class HexObserver extends Observer {
    public HexObserver() {
        setName("Hex");
    }

    @Override
    public void update() {
        setNumber(Integer.toHexString(getSubject().getState()));
    }
}
