package ir.ac.kntu.Command.GameBoy;

public class Main {
    public static void main(String[] args) {
        Console console = new Console();
        MarioCharacter mario = new MarioCharacter();

        MarioUpCommand upCommand = new MarioUpCommand(mario);
        MarioDownCommand downCommand = new MarioDownCommand(mario);
        MarioRightCommand rightCommand = new MarioRightCommand(mario);
        MarioLeftCommand leftCommand = new MarioLeftCommand(mario);

        console.setAll(upCommand, downCommand, rightCommand, leftCommand);
        console.pressUp();
        console.pressRight();
        console.pressDown();
        console.pressLeft();
        console.fire(() -> System.out.println("Mario Fire ..."));
        console.pressFire();
        System.out.println("========================");

        SnakeCharacter snake = new SnakeCharacter();
        SnakeUpCommand upCommand1 = new SnakeUpCommand(snake);
        SnakeDownCommand downCommand1 = new SnakeDownCommand(snake);
        SnakeRightCommand rightCommand1 = new SnakeRightCommand(snake);
        SnakeLeftCommand leftCommand1 = new SnakeLeftCommand(snake);

        console.setAll(upCommand1, downCommand1, rightCommand1, leftCommand1);
        console.pressUp();
        console.pressRight();
        console.pressDown();
        console.pressLeft();
        console.setUp(() -> System.out.println("Go Up"));
    }
}
