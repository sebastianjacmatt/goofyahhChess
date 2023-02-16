package com.example.model;

import com.example.grid.Location;

public class Move {
    public Location locFrom;
    public Location locTo;
    public Move(Location locFrom, Location locTo){
        this.locFrom = locFrom;
        this.locTo = locTo;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
