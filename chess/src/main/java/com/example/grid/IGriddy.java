package com.example.grid;

public interface IGriddy<T> {
    /**
     * returns the LocationItem<T> at a given location and returns it
     * @param loc
     * @return LocationItem<T>
     */
    LocationItem<T> get(Location loc);
    
    /**
     * given an object search trough the grid to find the location
     * @param o Object
     * @return location of Object o
     */
    Location locationOf(Object o);
    
    /**
     * using item(LocationItem<T>), set Location on grid to item
     * @param item LocationItem<T>
     */
    void set(LocationItem<T> item);
    
    /**
     * Checks if location(loc) is on the grid
     * @param loc Location
     * @return true if location is on grid
     */
    Boolean isInGrid(Location loc);
    
    /**
     * Given an LocationItem<T> set the entire grid to this item
     * @param item LocationItem
     */
    void initzialize(LocationItem<T> item);
    
    @Override
    String toString();
}
