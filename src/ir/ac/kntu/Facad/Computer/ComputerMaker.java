package ir.ac.kntu.Facad.Computer;

/**
 * Computer can be a huge complex object
 * that get created by too many objects
 * so we use facade class to create a computer
 * and get future of our computer by this
 */
public class ComputerMaker {
    private Cpu cpu;
    private Ram ram;
    private Drive drive;

    public ComputerMaker() {
        cpu = new Cpu();
        ram = new Ram();
        drive = new Drive();
    }

    public void turnSystemOn() {
        cpu.freeze();
        ram.setPosition(100);
        ram.ready();
        cpu.execute();
        drive.UnMount();
    }
}
