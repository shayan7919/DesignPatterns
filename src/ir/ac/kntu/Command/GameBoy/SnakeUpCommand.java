package ir.ac.kntu.Command.GameBoy;

public class SnakeUpCommand implements Command {
    SnakeCharacter snake;

    public SnakeUpCommand(SnakeCharacter snake) {
        this.snake = snake;
    }


    @Override
    public void execute() {
        snake.up();
    }
}
