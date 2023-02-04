package com.example.grid;

import com.example.grid.Griddy;
import com.example.grid.Location;
import com.example.grid.LocationItem;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class GriddyTest 
{   
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void constructorTest(){
        Griddy<Character> initGrid = new Griddy<Character>(8, 8, '_');
        Griddy<Character> grid = new Griddy<Character>(8, 8);

        
    }
}
