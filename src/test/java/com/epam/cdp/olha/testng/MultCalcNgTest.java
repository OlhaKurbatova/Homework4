package com.epam.cdp.olha.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultCalcNgTest extends BaseNgTest {

    @Test(dataProvider = "valuesForMultLong", groups = "long")
    public void multTwoLong(long a, long b, double expected) {
        long result = calculator.mult(a, b);
        Assert.assertEquals((double) result, expected, "Invalid result of mult long operation! ");
    }

    @Test(dataProvider = "valuesForMultDouble", groups = "double")
    public void multTwoDouble(double a, double b, double expected) {
        double result = calculator.mult(a, b);
        Assert.assertEquals(result, expected, "Invalid result of mult double operation! ");
    }

    //create dataprovider
    @DataProvider(name = "valuesForMultDouble")
    public Object[][] multValuesDouble() {
        return new Object[][]{
                {1, 2, 2},
                {0.5d, 0.5d, 0.25d},
                {Long.MAX_VALUE, 2, ((double) Long.MAX_VALUE * 2)}
        };
    }

    //create dataprovider
    @DataProvider(name = "valuesForMultLong")
    public Object[][] multValuesLong() {
        return new Object[][]{
                {1, 2, 2},
                {2, -2, -4},
                {Long.MAX_VALUE, 2, ((double) Long.MAX_VALUE * 2)}
        };
    }
}
