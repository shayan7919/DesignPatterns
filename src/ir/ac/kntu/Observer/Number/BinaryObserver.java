package ir.ac.kntu.Observer.Number;

public class BinaryObserver extends Observer {
    public BinaryObserver(){
        setName("Binary");
    }
    @Override
    public void update() {
        setNumber(Integer.toBinaryString(getSubject().getState()));
    }
}
