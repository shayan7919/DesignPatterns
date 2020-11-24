package ir.ac.kntu.AbstractFactory.Button;

public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(GuiFactory factory) {
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }
}
