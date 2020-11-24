package ir.ac.kntu.AbstractFactory.Button;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Painting with windows checkbox");
    }
}
