package ir.ac.kntu.Command.GameBoy;

public class SnakeDownCommand implements Command {
    SnakeCharacter snake;

    public SnakeDownCommand(SnakeCharacter snake) {
        this.snake = snake;
    }

    @Override
    public void execute() {
        snake.down();
    }
}
