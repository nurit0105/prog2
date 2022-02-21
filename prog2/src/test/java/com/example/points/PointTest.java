package com.example.points;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PointTest {


    @Test
    public void testCalcDistance_samePosition(){
        p1.setX(1.0);
        p1.setY(1.0);
        p2.setX(1.0);
        p2.setY(1.0);

        double actual = p1.calcDistance(p2);
        double expected = 0.0;
        assertEquals(expected,actual,0.0001);
    }

    @Test
    public void testCalcDistance_P2higher(){
        p1.setX(1.0);
        p1.setY(1.0);
        p2.setX(2.0);
        p2.setY(2.0);

        double actual = p1.calcDistance(p2);
        double expected = 1.41;
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void testCompare_samePosition(){
        p1.setX(1.0);
        p1.setY(1.0);
        p2.setX(1.0);
        p2.setY(1.0);

        assertTrue(p1.compare(p2));
    }

    @Test
    public void testCompare_P2higher(){
        p1.setX(1.0);
        p1.SetY(1.0);
        p2.setX(2.0);
        p2.Sety(2.0);

        assertFalse(p1.compare(p2));
    }
}
