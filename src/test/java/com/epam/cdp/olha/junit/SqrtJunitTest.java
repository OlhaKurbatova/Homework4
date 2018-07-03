package com.epam.cdp.olha.junit;

import com.epam.cdp.olha.testng.BaseNgTest;
import org.junit.Assert;
import org.junit.Test;

public class SqrtJunitTest extends BaseJunitTest {
    @Test
    public void sqrtPositive() {
        double result = calculator.sqrt(4);
        Assert.assertEquals("Invalid result of sqrt operation!", result, 2d, 0d);
    }

    @Test
    public void sqrtNegative() {
        double result = calculator.sqrt(-4);
        Assert.assertTrue("Invalid result of sqrt operation with negative. Expected NaN, actual " + result, Double.isNaN(result));
    }

}
