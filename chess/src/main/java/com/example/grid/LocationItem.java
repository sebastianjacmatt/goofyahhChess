package com.example.grid;

public class LocationItem<T> {
    Location loc;
    T item;
    protected LocationItem(Location loc, T item){
        this.loc = loc;
        this.item = item;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
