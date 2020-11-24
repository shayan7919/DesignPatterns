package ir.ac.kntu.Command.Editor;

public class Editor {
    private String clipboard;
    private CommandHistory history;
    private Command command;

    public void press() {
        command.execute();
    }
}
