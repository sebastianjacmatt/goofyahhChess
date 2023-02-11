package com.example.grid;

import java.util.ArrayList;
import java.util.Iterator;

public class Griddy<T> implements Iterable<LocationItem<T>> , IGriddy<T> {
    private int rows;
    private int cols;
    private ArrayList<ArrayList<LocationItem<T>>> grid;
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
                LocationItem<T> locItem = new LocationItem<T>(loc, get(loc).getItem());
                list.add(locItem);    
            }
        }
        return list.iterator();
    }
    @Override
    public LocationItem<T> get(Location loc) {
        return grid.get(loc.row).get(loc.col);
    }
    @Override
    public void set(LocationItem<T> item) {
        if (isInGrid(item.getLocation())) {
            grid.get(item.getLocation().row).set(item.getLocation().col, item);
        } else {
            throw new IllegalArgumentException("cannot set because items location is out of bounds");
        }
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
        for (ArrayList<LocationItem<T>> arrayList : grid) {
            for (int i = 0; i < cols; i++) {
                arrayList.set(i, item);
            }
        }
    }

    @Override 
    public int getRows(){
        return this.rows;
    }
    @Override
    public int getCols(){
        return this.cols;
    }  

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (ArrayList<LocationItem<T>> arrayList : grid) {
            for (int i = 0; i < cols; i++) {
                if (arrayList.get(i).getItem()==null) {
                    builder.append("null");
                } else {
                    builder.append("|");
                    builder.append(arrayList.get(i).getItem().toString());
                    builder.append("|");
                }
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}