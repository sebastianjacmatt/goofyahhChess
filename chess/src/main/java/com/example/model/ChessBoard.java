package com.example.model;

import com.example.grid.Griddy;
import com.example.grid.LocationItem;
import com.example.model.pieces.Piece;

public class ChessBoard extends Griddy<Tile<Piece>> {

    public ChessBoard(int rows, int cols, Tile<Piece> init) {
        super(rows, cols, init);
        //TODO Auto-generated constructor stub
    }

}
