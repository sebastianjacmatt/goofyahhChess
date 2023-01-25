package com.example.grid;

public class LocationItem<T> {
    Location loc;
    T item;
    public LocationItem(Location loc, T item){
        this.loc = loc;
        this.item = item;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return loc.toString().concat(item.toString());
    }
}
