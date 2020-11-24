package ir.ac.kntu.Command.Elec;

/**
 * Turning the device volume down by command
 */

public class VolumeDown implements Command {
    private final ElectDevice device;

    public VolumeDown(ElectDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeDown();
    }

    @Override
    public void undo() {
        device.volumeUp();
    }
}
