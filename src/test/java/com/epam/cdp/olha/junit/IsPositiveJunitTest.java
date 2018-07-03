package com.epam.cdp.olha.junit;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class IsPositiveJunitTest extends BaseJunitTest {

    @DataProvider
    public static Object[][] dataProviderPositiveValues() {
        return new Object[][]{
                {0l, false},
                {1l, true},
                {-1l, false}
        };
    }

    @Test
    @UseDataProvider("dataProviderPositiveValues")
    public void isPositiveTest(long a, boolean expected) {
        boolean result = calculator.isPositive(a);
        Assert.assertEquals("isPositive test failed", expected, result);
    }
}
