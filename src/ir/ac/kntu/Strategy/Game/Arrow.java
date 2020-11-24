package ir.ac.kntu.Strategy.Game;

public class Arrow implements WeaponStrategy {
    @Override
    public void use() {
        System.out.println("Shoot to the enemy");
    }
}
