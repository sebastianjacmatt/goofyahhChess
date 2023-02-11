package com.example;

import javax.swing.JFrame;

import com.example.grid.Griddy;
import com.example.view.GamePanel;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        Griddy<Character> grid = new Griddy<>(8, 8,'_');
        System.out.println(grid.toString());

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        GamePanel panel = new GamePanel();
        window.add(panel);

        window.pack();

        window.setVisible(true);
        
    }
}
