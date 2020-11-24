package ir.ac.kntu.Command.Elec;

/**
 * Turning the device off by command
 */
public class TurnOff implements Command {
    private final ElectDevice device;

    public TurnOff(ElectDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOff();
    }

    @Override
    public void undo() {
        device.turnOn();
    }
}
