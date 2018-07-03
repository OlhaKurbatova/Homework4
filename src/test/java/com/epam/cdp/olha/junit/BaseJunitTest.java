package com.epam.cdp.olha.junit;

import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class BaseJunitTest {

    protected static Calculator calculator;

    @BeforeClass
    public static void setUp() {
        calculator = new Calculator();
    }

    @AfterClass
    public static void tearDown() {
        calculator = null;
    }
}
