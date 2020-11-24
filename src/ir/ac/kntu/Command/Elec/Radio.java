package ir.ac.kntu.Command.Elec;

public class Radio extends ElectDevice {

    @Override
    public void turnOn() {
        System.out.println("Turning the Radio On");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning the Radio Off");
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
