package com.cuongtt.game101;

import org.junit.Assert;
import org.junit.Test;


public class Vector2DTest {


    @Test
    public void addTestCase01(){
        Vector2D v1 = new Vector2D(1, 3);
        Vector2D v2 = new Vector2D(2, 5);

        Vector2D vectorExpected = new Vector2D(3, 8);

        Assert.assertEquals(vectorExpected, Vector2D.add(v1, v2));
    }
}