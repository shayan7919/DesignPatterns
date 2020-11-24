package ir.ac.kntu.Command.GameBoy;

public class MarioUpCommand implements Command {
    MarioCharacter mario;

    public MarioUpCommand(MarioCharacter mario) {
        this.mario = mario;
    }

    @Override
    public void execute() {
        mario.up();
    }
}
