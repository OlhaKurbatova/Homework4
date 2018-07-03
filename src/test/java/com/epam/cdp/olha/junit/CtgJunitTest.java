package com.epam.cdp.olha.junit;

import org.junit.Assert;
import org.junit.Test;

public class CtgJunitTest extends BaseJunitTest{

    @Test
    public void ctgTest(){
        double result = calculator.ctg(Math.toRadians(30));
        Assert.assertEquals("Failed to find ctg", 1.732, result, 0.01d);
    }
}
