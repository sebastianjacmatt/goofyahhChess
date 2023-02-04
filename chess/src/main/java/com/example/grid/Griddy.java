package com.example.grid;

import java.util.ArrayList;
import java.util.Iterator;

//package pakke/navn/Class.java
//npm install
public class Griddy<T> implements Iterable<LocationItem<T>> , IGriddy<T> {
    private int rows;
    private int cols;
    private ArrayList<ArrayList<LocationItem<T>>> grid;
    //TODO change underlying grid structure from a two dimensional array to a one dimensinal array
    public Griddy (int rows, int cols, T init){
        this.rows = rows;
        this.cols = cols;
        this.grid = new ArrayList<ArrayList<LocationItem<T>>>();
        for (int i = 0; i < rows; i++) {
            ArrayList<LocationItem<T>> colList = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                Location loc = new Location(i, j);
                LocationItem<T> item = new LocationItem<T>(loc, init);
                colList.add(item);
            }
            grid.add(colList);
        }
    }
    public Griddy (int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        this.grid = new ArrayList<ArrayList<LocationItem<T>>>();
        for (int i = 0; i < rows; i++) {
            ArrayList<LocationItem<T>> colList = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                Location loc = new Location(i, j);
                LocationItem<T> item = new LocationItem<T>(loc, null);
                colList.add(item);
            }
            grid.add(colList);
        }
    }
    

    @Override
    public Iterator<LocationItem<T>> iterator() {
        ArrayList<LocationItem<T>> list = new ArrayList<LocationItem<T>>();
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                Location loc = new Location(row, col);
                LocationItem<T> locItem = new LocationItem<T>(loc, get(loc));
                list.add(locItem);    
            }
        }
        return list.iterator();
    }
    @Override
    public T get(Location loc) {
        return grid.get(loc.row).get(loc.col).getItem();
    }
    @Override
    public void set(LocationItem<T> item) {
        grid.get(item.getLocation().row).set(item.getLocation().col, item);
    }
    @Override
    public Boolean isInGrid(Location loc) {
        if (!((loc.row > cols || loc.col > cols) || (loc.row < 0 || loc.col < 0))) {
            return true;
        }
        return false;
    }
    @Override
    public Location locationOf(Object o) {
        for (LocationItem<T> elem : this) {
            if (o.equals(elem)) {
                return elem.getLocation();
            }
        }
        return null;
    }
    @Override
    public void initzialize(LocationItem<T> item) {
        
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
