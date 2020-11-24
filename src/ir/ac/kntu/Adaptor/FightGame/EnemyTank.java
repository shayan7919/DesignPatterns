package ir.ac.kntu.Adaptor.FightGame;

public class EnemyTank implements EnemyAttacker {
    @Override
    public void fireWeapon() {
        System.out.println("Tank Fire a bomb");
    }

    @Override
    public void driveForward() {
        System.out.println("Tank moves inside enemy territory");
    }

    @Override
    public void assignDriver(String name) {
        System.out.println(name + " drives the tank");
    }
}
