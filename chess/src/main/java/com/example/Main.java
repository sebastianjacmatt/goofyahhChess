package com.example;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

import com.example.controller.Controller;
import com.example.grid.Griddy;
import com.example.grid.Location;
import com.example.grid.LocationItem;
import com.example.model.ChessBoard;
import com.example.model.Model;
import com.example.model.Tile;
import com.example.model.pieces.Piece;
import com.example.view.GamePanel;
import com.example.view.View;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(true);
        window.setTitle("Chess");
        
        Tile<Piece> testTile = new Tile<Piece>(Color.BLACK);
        Model model = new Model(new ChessBoard(8, 8, testTile));
        View view = new View(model);
        view.setPreferredSize(new Dimension(512,512));

        window.add(view);
        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
