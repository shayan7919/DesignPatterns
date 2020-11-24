package ir.ac.kntu.Command.GameBoy;

public class SnakeLeftCommand implements Command {
    SnakeCharacter snake;

    public SnakeLeftCommand(SnakeCharacter snake) {
        this.snake = snake;
    }

    @Override
    public void execute() {
        snake.left();
    }
}
