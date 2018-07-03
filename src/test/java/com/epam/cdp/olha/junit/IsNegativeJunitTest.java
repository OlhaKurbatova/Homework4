package com.epam.cdp.olha.junit;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class IsNegativeJunitTest extends BaseJunitTest {

    @DataProvider
    public static Object[][] dataProviderNegativeValues() {
        return new Object[][]{
                {0l, false},
                {1l, false},
                {-1l, true}
        };
    }

    @Test
    @UseDataProvider("dataProviderNegativeValues")
    public void isNegativeTest(long a, boolean expected) {
        boolean result = calculator.isNegative(a);
        Assert.assertEquals("isNegative test failed", expected, result);
    }
}
