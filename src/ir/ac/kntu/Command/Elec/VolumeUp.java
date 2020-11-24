package ir.ac.kntu.Command.Elec;

/**
 * Turning the device volume up by command
 */

public class VolumeUp implements Command {
    private final ElectDevice device;

    public VolumeUp(ElectDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeUp();
    }

    @Override
    public void undo() {
        device.volumeDown();
    }
}
