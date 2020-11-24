package ir.ac.kntu.Command.Elec;

/**
 * This Tv is a Electronic device
 */
public class Television extends ElectDevice {

    @Override
    public void turnOn() {
        System.out.println("Turning the Tv On");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning the Tv Off");
    }

    @Override
    public void volumeUp() {
        super.increaseVolume();
    }

    @Override
    public void volumeDown() {
        super.decreaseVolume();
    }
}
