package ir.ac.kntu.AbstractFactory.Button;

public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Painting inside Windows button");
    }
}
