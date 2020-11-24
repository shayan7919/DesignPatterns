package ir.ac.kntu.Pacman;

import java.util.Objects;
import java.util.Random;

public class Location {
    private int row; // row
    private int column; // column

    public Location(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public static Location getRandom(int size) {
        int first = new Random().nextInt(size);
        int second = new Random().nextInt(size);
        return new Location(first, second);
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }


    @Override
    public String toString() {
        return "row: " + row + "\tcolumn: " + column;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Location location = (Location) o;
        return row == location.row && column == location.column;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, column);
    }
}
