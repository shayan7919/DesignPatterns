package ir.ac.kntu.Command.Elec;

/**
 * This is our invoker
 * which get command by constructor
 * and execute each command
 */
public class DeviceButton {
    private Command command;
    private Command lastCommand;

    public DeviceButton() {
        command = new NoCommand();
    }

    // Or you can use constructor instead
    public void setCommand(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
        lastCommand = command;
    }

    public void pressUndo() {
        lastCommand.undo();
    }
}
