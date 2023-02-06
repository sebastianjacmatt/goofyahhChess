package com.example.grid;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import java.util.Random;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class GriddyTest {
    public GriddyTest(){

    }   
    @Test
    public void constructorTest(){
        Griddy<Character> grid = new Griddy<Character>(8, 8);
        Griddy<Character> initGrid = new Griddy<Character>(8, 8, '_');

        assertFalse(grid.isInGrid(new Location(-1, 0)));
        assertFalse(grid.isInGrid(new Location(0, -1)));
        assertFalse(grid.isInGrid(new Location(0, -1)));
        assertFalse(grid.isInGrid(new Location(-1, 0)));

        assertFalse(initGrid.isInGrid(new Location(-1, 0)));
        assertFalse(initGrid.isInGrid(new Location(0, -1)));
        assertFalse(initGrid.isInGrid(new Location(0, -1)));
        assertFalse(initGrid.isInGrid(new Location(-1, 0)));
    }
    @Test
    public void getterNSetterTest(){
        Griddy<Character> grid = new Griddy<Character>(8, 8);
        Griddy<Character> initGrid = new Griddy<Character>(8, 8, '_');

        //_________________________________Example items for testing________________
        LocationItem<Character> item1 = new LocationItem<Character>(new Location(1, 1), 'T');
        LocationItem<Character> item2 = new LocationItem<Character>(new Location(5, 7), 'T');
        LocationItem<Character> item3 = new LocationItem<Character>(new Location(7, 7), 'T');
        LocationItem<Character> item4 = new LocationItem<Character>(new Location(8, 8), 'T');

        //_________________________________Testing grid with null_______________________
        grid.set(item1);
        grid.set(item2);
        grid.set(item3);
        // try catch block to check for IlligealArgumentExceptions
        try {
            grid.set(item4);
            assertFalse("IllegalArgumentException not thrown", true);
        } catch (Exception e) {}

        
        assertEquals(grid.get(item1.getLocation()), item1);
        assertEquals(grid.get(item2.getLocation()), item2);
        assertEquals(grid.get(item3.getLocation()), item3);
        // try catch block to check for IlligealArgumentExceptions
        try {
            grid.get(item4.getLocation());
            assertFalse("IllegalArgumentException not thrown", true);
        } catch (Exception e) {}

        //_________________________________Testing grid with ini____________________________
        initGrid.set(item1);
        initGrid.set(item2);
        initGrid.set(item3);
        // try catch block to check for IlligealArgumentExceptions
        try {
            grid.set(item4);
            assertFalse("IllegalArgumentException not thrown", true);
        } catch (Exception e) {}

        
        assertEquals(initGrid.get(item1.getLocation()), item1);
        assertEquals(initGrid.get(item2.getLocation()), item2);
        assertEquals(initGrid.get(item3.getLocation()), item3);
        // try catch block to check for IlligealArgumentExceptions
        try {
            initGrid.get(item4.getLocation());
            assertFalse("IllegalArgumentException not thrown", true);
        } catch (Exception e) {}
    }

    @Test
    public void initzializeTest(){
        Griddy<Boolean> grid = new Griddy<Boolean>(8, 8);
        Griddy<Boolean> initGrid = new Griddy<Boolean>(8, 8, false);

        LocationItem<Boolean> item = new LocationItem<Boolean>(new Location(0, 0), false);

        grid.initzialize(item);

        for (LocationItem<Boolean> locationItem : grid) {
            assertFalse(locationItem.getItem().equals(true));
        }
        
        initGrid.initzialize(item);
        for (LocationItem<Boolean> locationItem : initGrid) {
            assertFalse(locationItem.getItem().equals(false));
        }
        for (LocationItem<Boolean> locationItem : initGrid) {
            assertFalse(locationItem.getItem().equals(true));
        }
    }
    @Test
    public void locationOfTest(){
        Griddy<Boolean> grid = new Griddy<Boolean>(8, 8);
        Griddy<Boolean> initGrid = new Griddy<Boolean>(8, 8, false);

        grid.initzialize(new LocationItem<Boolean>(new Location(0, 0), false));
        initGrid.initzialize(new LocationItem<Boolean>(new Location(0, 0), false));
        
        Random r1 = new Random();
        Random r2 = new Random();

        grid.set(new LocationItem<Boolean>(new Location(r1.nextInt(7), r2.nextInt(7)), true));
        initGrid.set(new LocationItem<Boolean>(new Location(r1.nextInt(7), r2.nextInt(7)), true));
    }  
    @Test
    public void isInGridTest(){
        //TODO implement isInGridTest
    }
    @Test
    public void iteratorTest(){
        //TODO implement iteratorTest
    }
}
