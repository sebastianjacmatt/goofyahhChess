package com.example.grid;

public class Location {
    public final int row;
    public final int col;

    public Location (int row, int col) {
        this.row = row;
        this.col = col;
    }
    @Override
    public String toString() {
        return new String(""+this.row+","+this.col+"");
    }
}
