package ir.ac.kntu.Command.GameBoy;

public class SnakeRightCommand implements Command {
    SnakeCharacter snake;

    public SnakeRightCommand(SnakeCharacter snake) {
        this.snake = snake;
    }

    @Override
    public void execute() {
        snake.right();
    }
}
