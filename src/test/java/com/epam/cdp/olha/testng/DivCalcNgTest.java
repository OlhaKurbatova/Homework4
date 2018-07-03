package com.epam.cdp.olha.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivCalcNgTest extends BaseNgTest {

    @Test(dataProvider = "valuesForDiv", groups = "long")
    public void divTwoLong(long a, long b, double expected) {
        long result = calculator.div(a, b);
        Assert.assertEquals((double) result, expected, "Invalid result of div long operation! ");
    }

    @Test(dataProvider = "valuesForDiv", groups = "double")
    public void divTwoDouble(double a, double b, double expected) {
        double result = calculator.div(a, b);
        Assert.assertEquals(result, expected, "Invalid result of div double operation! ");
    }

    @Test(groups = "special")
    public void divByZeroLong(){
        Assert.assertThrows(NumberFormatException.class, new Assert.ThrowingRunnable() {
            @Override
            public void run() throws Throwable {
                calculator.div(1l, 0l);
            }
        });
    }

    @Test(groups = "special")
    public void divByZeroDouble(){
        Assert.assertThrows(NumberFormatException.class, new Assert.ThrowingRunnable() {
            @Override
            public void run() throws Throwable {
                calculator.div(1d, 0d);
            }
        });
    }

    //create dataprovider
    @DataProvider(name = "valuesForDiv")
    public Object[][] divValuesLong() {
        return new Object[][]{
                {2, 2, 1},
                {0, 1, 0},
                {-2, 4, -0.5}
        };
    }
}
