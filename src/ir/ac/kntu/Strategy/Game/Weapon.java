package ir.ac.kntu.Strategy.Game;

public class Weapon {
    private WeaponStrategy strategy;

    public Weapon(WeaponStrategy strategy) {
        this.strategy = strategy;
    }

    public void use() {
        strategy.use();
    }
}
