package com.example.view;

import javax.swing.JComponent;
import javax.swing.JFrame;

import com.example.controller.Controller;
import com.example.grid.Griddy;
import com.example.grid.Location;
import com.example.grid.LocationItem;
import com.example.model.Model;
import com.example.model.Tile;

import java.awt.Graphics;
import java.util.Iterator;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;


public class View extends JComponent implements IView {
    
    Graphics g;
    Griddy<Tile> grid;

    public View(Griddy<Tile> grid){
        this.grid = grid;
    }
    @Override
    public void paint(Graphics canvas) {
        super.paint(canvas);
        this.drawChessBoard(canvas, 0 , 0 , this.getWidth(), this.getHeight(), 1);
    }
    public void drawChessBoard(Graphics graphics,int x,int y,int width,int height,int padding){
        drawChessWithRightBottomPaddingBoard(graphics, x, y, width-padding, height-padding, padding);
    }
    private void drawChessWithRightBottomPaddingBoard(Graphics g, int x , int y , int height , int widht, int padding){
        for (LocationItem<Tile> locationItem : grid) {
            int row = locationItem.getLocation().row;
            int col = locationItem.getLocation().col;
            Tile tile = locationItem.getItem();
            
            // if tile is not initialized to color, it will automatically set the tile to white
            Color color;
            if (tile == null) {
                color = Color.BLACK;
            } else {
                color = tile.color;
            }

            int tileX = x + col * widht / grid.getCols();
            int tileY = y + row * height / grid.getRows();

            int nextTileX = x + (col + 1) * widht / grid.getCols();
            int nextTileY = y + (row + 1) * height / grid.getRows();

            int tileWidth = nextTileX - tileX;
            int tileHeight = nextTileY - tileY;

            drawTile(g, tileX, tileY, tileWidth, tileHeight, color ,padding);
        }
    }
    private void drawTile(Graphics g, int x, int y, int width ,int height, Color color, int padding){
        g.setColor(color);
        g.fillRect(x, y, (width - padding), (height - padding));
    }
}
