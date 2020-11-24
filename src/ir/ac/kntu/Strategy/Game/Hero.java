package ir.ac.kntu.Strategy.Game;

public class Hero {
    private String name;
    private int health;
    private Weapon weapon;

    public Hero(Weapon weapon) {
        this.weapon = weapon;
    }

    public void fight() {
        weapon.use();
    }
}
/*
Hero
weapon

 */