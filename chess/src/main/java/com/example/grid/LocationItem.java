package com.example.grid;

public class LocationItem<T> {
    private Location loc;
    private T item;
    public LocationItem(Location loc, T item){
        this.loc = loc;
        this.item = item;
    }
    public Location getLocation() {
        return this.loc;
    }
    public T getItem(){
        return this.item;
    }
    @Override
    public String toString() {
        return loc.toString().concat(item.toString());
    }
}
