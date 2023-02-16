package com.example.model.pieces;

import java.util.List;

import java.awt.Color;

import com.example.grid.Location;
import com.example.model.Model;
import com.example.model.Move;

public abstract class Piece {
    private Location pos;
    private Color color;
    private String name;
    public Piece(Location pos, Color color, String name){
        this.pos = pos;
        this.color = color;
        this.name = name;

    }
    public boolean isValidMove(Move move){
        return false;
    }
    public List<Move> getValidMoves(Model model){
        return null;
    }
    public Color getColor(){
        return color;
    }
    public Location getPostion(){
        return pos;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {   
        return name;
    }
}
