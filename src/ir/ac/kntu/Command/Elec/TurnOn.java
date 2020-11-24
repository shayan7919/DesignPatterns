package ir.ac.kntu.Command.Elec;

/**
 * Turning the device on by command
 */
public class TurnOn implements Command {
    private final ElectDevice device;

    public TurnOn(ElectDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }

    @Override
    public void undo() {
        device.turnOff();
    }
}
