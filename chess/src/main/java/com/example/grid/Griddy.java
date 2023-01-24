package com.example.grid;
//package pakke/navn/Class.java
//npm install
public class Griddy<T> implements IGriddy<T> {
    private int row;
    private int col;
    private T tileType;
    Griddy (int row, int col){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                
            }
        }
    }
    @Override
    public LocationItem<T> get(Location loc) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public Boolean set(LocationItem<T> item) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public Boolean isInGrid(Location loc) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public Void initzialize(LocationItem<T> item) {
        // TODO Auto-generated method stub
        return null;
    }
}
