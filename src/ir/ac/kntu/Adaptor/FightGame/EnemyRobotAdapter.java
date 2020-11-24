package ir.ac.kntu.Adaptor.FightGame;

public class EnemyRobotAdapter implements EnemyAttacker {
    EnemyRobot enemyRobot;

    @Override
    public void fireWeapon() {
        enemyRobot.fight();
    }

    @Override
    public void driveForward() {
        enemyRobot.move();
    }

    @Override
    public void assignDriver(String name) {
        enemyRobot.assignController(name);
    }
}
