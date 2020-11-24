package ir.ac.kntu.Command.GameBoy;

public class MarioDownCommand implements Command {
    MarioCharacter mario;

    public MarioDownCommand(MarioCharacter mario) {
        this.mario = mario;
    }

    @Override
    public void execute() {
        mario.down();
    }
}
