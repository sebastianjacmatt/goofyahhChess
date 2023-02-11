package com.example.view;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable {
    final int originalTileSize = 16; //standart tile size in game
    final int scalor = 3;
    
    final int tileSize = originalTileSize * scalor;
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCol; //48 * 16 = 768
    final int screenHeight = tileSize * maxScreenRow; //48 * 12 = 576

    Thread gameThread;

    public GamePanel(){

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);

    }

    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start();
    }
    @Override
    public void run() {
        // core of the game
        // TODO Auto-generated method stub
        
    }



    
}
