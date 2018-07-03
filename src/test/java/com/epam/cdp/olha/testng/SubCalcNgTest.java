package com.epam.cdp.olha.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubCalcNgTest extends BaseNgTest {

    @Test(dataProvider = "valuesForSubLong", groups = "double")
    public void subTwoLong(long a, long b, double expected) {
        long result = calculator.sub(a, b);
        Assert.assertEquals((double) result, expected, "Invalid result of sub operation!");
    }

    //create dataprovider
    @DataProvider(name = "valuesForSubLong")
    public Object[][] subValuesLong() {
        return new Object[][]{
                {1, 2, -1},
                {2, -1, 3},
                {Long.MIN_VALUE, 1, ((double) Long.MIN_VALUE - 1)}
        };
    }
}
