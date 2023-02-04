package com.example.grid;

public interface IGriddy<T> {
    T get(Location loc);
    
    Location locationOf(Object o);
    
    void set(LocationItem<T> item);
    
    Boolean isInGrid(Location loc);
    
    void initzialize(LocationItem<T> item);

    @Override
    String toString();
}
