package ir.ac.kntu.Pacman;

public class MyMap {
    private final Movable[][] map;
    private final int size;
    private Location location;


    public MyMap(int size) {
        this.size = size;
        map = new Movable[size][size];
        initialize();
    }

    public void initialize() {
        for (int i = 0; i < 4; i++) {
            location = Location.getRandom(size);
            insertCell(location, new Ghost());
        }
        for (int i = 0; i < 20; i++) {
            location = Location.getRandom(size);
            if (getCell(location) == null) {
                insertCell(location, new Coin());
            }
        }
        for (int i = 0; i < size; i++) { // size
            for (int j = 0; j < size; j++) { // size
                if (map[i][j] == null) {
                    map[i][j] = new Nothing();
                }
            }
        }
    }


    public void show() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }


    public void setPacMan(Location location, PacMan pacMan) {
        this.location = location;
        map[location.getRow()][location.getColumn()] = pacMan;
    }

    public void insertCell(Location location, Movable movable) {
        map[location.getRow()][location.getColumn()] = movable;
    }

    public Movable getCell(Location location) {
        return map[location.getRow()][location.getColumn()];
    }

    public Location getLocation() {
        return location;
    }
}
