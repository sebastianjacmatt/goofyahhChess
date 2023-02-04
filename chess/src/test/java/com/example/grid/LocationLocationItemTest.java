package com.example.grid;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class LocationLocationItemTest 
{   
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void stringTester(){
        Location loc = new Location(0, 0);
        LocationItem<Character> item = new LocationItem<Character>(loc,'C');

        assertEquals(loc.toString(),""+loc.row+","+ loc.col+"");
        assertEquals(item.toString(), ""+loc.row+","+ loc.col+"C");
    }
}
