package com.epam.cdp.olha.junit;

import org.junit.Assert;
import org.junit.Test;

public class SinJunitTest extends BaseJunitTest{

    @Test
    public void sinTest(){
        double result = calculator.sin(Math.toRadians(30));
        Assert.assertEquals("Failed to find sin", 0.5, result, 0.01d);
    }
}
