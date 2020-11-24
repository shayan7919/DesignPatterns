package ir.ac.kntu.Command.Elec;

/**
 * Command interface
 * If you want to keep a history of last commands
 * you can use stack instead of a reference inside invoker
 */
public interface Command {
    void execute();

    void undo();

}
