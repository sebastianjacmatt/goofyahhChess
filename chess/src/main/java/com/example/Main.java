package com.example;

import com.example.grid.Griddy;

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
    }
}
