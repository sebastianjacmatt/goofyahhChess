package com.example.view;


import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

import com.example.controller.Controller;

public class GamePanel extends JPanel implements Runnable {
    final int originalTileSize = 16; //standart tile size in game
    final int scalor = 3;
    
    final int tileSize = originalTileSize * scalor;
    final int maxScreenCol = 16;
    final int maxScreenRow = 16;
    final int screenWidth = tileSize * maxScreenCol; //48 * 16 = 768
    final int screenHeight = tileSize * maxScreenRow; //48 * 12 = 576

    //FPS
    int fps = 60;

    Controller keyH = new Controller();
    Thread gameThread;

    int playerX = 100;
    int playerY = 100;
    int playerSpeed = 4;

    public GamePanel(){

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
        
        this.addKeyListener(keyH);
        this.setFocusable(true);

    }

    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start();
    }
    @Override
    public void run() {
        // core of the game
        // TODO Auto-generated method stub
        
        double drawIntervall = 1000000000/fps;
        double nextDrawTime = System.nanoTime() + drawIntervall;
        
        while (gameThread != null) {
             
            //UPDATE: update information such as character position
            update();

            //DRAW: draw the screen with the updated information
            repaint();

            
            try {
                double remainingTime = nextDrawTime - System.nanoTime();
                remainingTime = remainingTime/1000000;

                if (remainingTime < 0) {
                    remainingTime = 0;
                }

                Thread.sleep((long) remainingTime);

                nextDrawTime += drawIntervall;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void update(){
        if (keyH.upPressed == true) {
            playerY = playerY - playerSpeed;
        }
        if (keyH.downPressed == true) {
            playerY = playerY + playerSpeed;
        }
        if (keyH.leftPressed == true) {
            playerX = playerX - playerSpeed;
        }
        if (keyH.rightPressed == true) {
            playerX = playerX + playerSpeed;
        }
    }
    public void paintComponent(Graphics g){

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g; //casting g to 2d

        g2.setColor(Color.WHITE);

        g2.fillRect(playerX, playerY, tileSize, tileSize);

        g2.dispose();
    }



    
}
