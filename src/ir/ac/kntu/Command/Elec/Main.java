package ir.ac.kntu.Command.Elec;

public class Main {
    public static void main(String[] args) {
        ElectDevice device = new Television();
        TurnOn turnOn = new TurnOn(device);
        DeviceButton button = new DeviceButton();
        button.setCommand(turnOn);
        button.press();

        device = new Radio();
        turnOn = new TurnOn(device);
        button.setCommand(turnOn);
        button.press();
        button.pressUndo();
    }
}
