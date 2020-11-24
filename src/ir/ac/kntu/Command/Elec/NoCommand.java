package ir.ac.kntu.Command.Elec;

public class NoCommand implements Command {
    @Override
    public void execute() {
        // do nothing (use this for first instantiate)
    }

    @Override
    public void undo() {
        // Also do nothing
    }
}
