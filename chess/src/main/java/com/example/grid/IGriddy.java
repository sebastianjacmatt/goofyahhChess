package com.example.grid;

public interface IGriddy<T> {
    LocationItem<T> get(Location loc);
    Boolean set(LocationItem<T> item);
    Void initzialize(LocationItem<T> item);
    Boolean isInGrid(Location loc);
    
    @Override
    String toString();
}
