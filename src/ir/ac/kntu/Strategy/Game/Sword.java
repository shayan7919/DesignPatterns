package ir.ac.kntu.Strategy.Game;

public class Sword implements WeaponStrategy {
    @Override
    public void use() {
        System.out.println("Cut in the half");
    }
}
