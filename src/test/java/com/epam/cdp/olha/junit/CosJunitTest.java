package com.epam.cdp.olha.junit;

import org.junit.Assert;
import org.junit.Test;

public class CosJunitTest extends BaseJunitTest{

    @Test
    public void cosTest(){
        double result = calculator.cos(Math.toRadians(30));
        Assert.assertEquals("Failed to find cos", 0.866, result, 0.01d);
    }
}
