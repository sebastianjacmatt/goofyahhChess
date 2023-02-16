package com.example.model.pieces;

import java.awt.Color;

import com.example.grid.Location;

public class Pawn extends Piece {
    private Color color;
    private String name;
    private Location pos; 
    
    public Pawn(Location pos, Color color, String name) {
        super(pos, color, name);
    }
    @Override
    public boolean isValidMove(Move move) {
        return false;
    }

   

    
}
