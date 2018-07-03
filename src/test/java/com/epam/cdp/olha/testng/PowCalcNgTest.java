package com.epam.cdp.olha.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowCalcNgTest extends BaseNgTest {

    @Test(dataProvider = "valuesForPowLong", groups = "double")
    public void powTwoLong(double a, double b, double expected) {
        double result = calculator.pow(a, b);
        Assert.assertEquals(result, expected, "Invalid result of pow operation!");
    }

    //create dataprovider
    @DataProvider(name = "valuesForPowLong")
    public Object[][] powValuesLong() {
        return new Object[][]{
                {2, 3, 8},//+
                {0.5d, 2, 0.25d},//+
                {-2, 3, -8},//+
                {3, 0, 1},//+
                {4, 1.5, 8}//-
        };
    }
}
