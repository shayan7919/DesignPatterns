package ir.ac.kntu.Pacman;

import static ir.ac.kntu.Pacman.Factory.Type.*;

public class Move {
    MyMap map;

    public Move(MyMap map) {
        this.map = map;
    }

    public void left(PacMan pacMan) {
        if (map.getLocation().getColumn() > 0) {
            map.insertCell(map.getLocation(), Factory.getMovable(NOTHING));
            map.getLocation().setColumn(map.getLocation().getColumn() - 1);
            pacMan.whatHappened(map.getCell(map.getLocation()));
            map.setPacMan(map.getLocation(), pacMan);
        }
    }

    public void right(PacMan pacMan) {
        if (map.getLocation().getColumn() < 10) {
            map.insertCell(map.getLocation(), Factory.getMovable(NOTHING));
            map.getLocation().setColumn(map.getLocation().getColumn() + 1);
            pacMan.whatHappened(map.getCell(map.getLocation()));
            map.setPacMan(map.getLocation(), pacMan);
        }
    }

    public void down(PacMan pacMan) {
        if (map.getLocation().getRow() < 10) {
            map.insertCell(map.getLocation(), Factory.getMovable(NOTHING));
            map.getLocation().setRow(map.getLocation().getRow() + 1);
            pacMan.whatHappened(map.getCell(map.getLocation()));
            map.setPacMan(map.getLocation(), pacMan);
        }
    }

    public void up(PacMan pacMan) {
        if (map.getLocation().getRow() > 0) {
            map.insertCell(map.getLocation(), Factory.getMovable(NOTHING));
            map.getLocation().setRow(map.getLocation().getRow() - 1);
            pacMan.whatHappened(map.getCell(map.getLocation()));
            map.setPacMan(map.getLocation(), pacMan);
        }
    }
}
