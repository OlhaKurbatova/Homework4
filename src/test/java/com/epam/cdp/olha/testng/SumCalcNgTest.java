package com.epam.cdp.olha.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumCalcNgTest extends BaseNgTest {
    @Test(dataProvider = "valuesForSumLong", groups = "long")
    public void sumTwoLong(long a, long b, double expected) {
        long result = calculator.sum(a, b);
        Assert.assertEquals((double) result, expected, "Invalid result of sum operation!");
    }

    //create dataprovider
    @DataProvider(name = "valuesForSumLong")
    public Object[][] sumValuesLong() {
        return new Object[][]{
                {1, 2, 3},
                {-2, -3, -5},
                {Long.MAX_VALUE, 1, ((double) Long.MAX_VALUE + 1)}
        };
    }
}
