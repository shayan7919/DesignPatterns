package ir.ac.kntu.Command.Editor;

import java.util.Stack;

public class CommandHistory {
    private final Stack<Command> history;

    public CommandHistory() {
        history = new Stack<>();
    }

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }
}