package ir.ac.kntu.Observer.Number;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Provider();
        Observer binary = new BinaryObserver();
        Observer octal = new OctalObserver();
        Observer hex = new HexObserver();

        subject.register(binary);
        subject.register(octal);
        subject.register(hex);

        subject.setState(12);

        subject.getObservers().forEach(System.out::println);

    }
}
