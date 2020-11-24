package ir.ac.kntu.Command.Elec;

/**
 * Interface or abstract class which receiver should implement it
 */
public abstract class ElectDevice {
    private int volume;

    abstract void turnOn();

    abstract void turnOff();

    abstract void volumeUp();

    abstract void volumeDown();

    public void increaseVolume() {
        volume += 5;
    }

    public void decreaseVolume() {
        volume += 5;
    }
}
