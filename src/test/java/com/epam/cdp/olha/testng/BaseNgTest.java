package com.epam.cdp.olha.testng;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseNgTest {

    protected Calculator calculator;

    @BeforeClass
    public void setUp() {

        calculator = new Calculator();
    }

    @AfterClass
    public void tearDown() {
        calculator = null;
    }
}
