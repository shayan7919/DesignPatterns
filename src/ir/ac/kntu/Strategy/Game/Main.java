package ir.ac.kntu.Strategy.Game;

public class Main {
    public static void main(String[] args) {
        Hero hero = new King(new Weapon(new Sword()));
        hero.fight();
        hero = new Queen(new Weapon(new Arrow()));
        hero.fight();
    }
}
