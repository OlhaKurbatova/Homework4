package com.epam.cdp.olha.junit;

import org.junit.Assert;
import org.junit.Test;

public class TgJunitTest extends BaseJunitTest{

    @Test
    public void tgTest(){
        double result = calculator.tg(Math.toRadians(30));
        Assert.assertEquals("Failed to find tg", 0.577d, result, 0.01d);
    }
}
