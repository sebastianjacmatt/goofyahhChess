package com.example.model;

import java.awt.Color;
import java.util.Iterator;
import java.util.List;

import javax.swing.JPanel;

import com.example.controller.IController;
import com.example.grid.Griddy;
import com.example.grid.Location;
import com.example.grid.LocationItem;
import com.example.model.pieces.Piece;
import com.example.view.IView;

public class Model implements Iterable<Piece>{
    private ChessBoard chessBoard;
    public Model(ChessBoard chessBoard) {
        this.chessBoard = new ChessBoard(8, 8, new Tile<Piece>(Color.BLACK));
    }
    /*
     * Should return a list of possible locations a piece can move to
     */
    public List<Location> returnPossibleMoves(){
        return null;
    }
    public boolean movePiece(){
        return false;
    }  
    public int getRows(){
        return chessBoard.getRows();
    }
    public int getCols(){
        return chessBoard.getCols();
    }
    @Override
    public Iterator<Piece> iterator() {
        // TODO Auto-generated method stub
        return chessBoard.iterator();
    }
    
}
