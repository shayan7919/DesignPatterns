package ir.ac.kntu.Command.GameBoy;

public class MarioRightCommand implements Command{
    MarioCharacter mario;

    public MarioRightCommand(MarioCharacter mario) {
        this.mario = mario;
    }

    @Override
    public void execute() {
        mario.right();
    }
}
