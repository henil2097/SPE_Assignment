package com.calculator;

import com.calculator.Calculator;
import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CalculatorTest {
    private Calculator calculator;
    @Before
    public void setCalculator(){
        calculator = new Calculator();
    }

    @Test
    public void testAdd(){
        //assertTrue(true);
        int a = 10;
        int b = 25;
        long expectedResult = 250;
        long result = calculator.mul(a,b);
        assertEquals(expectedResult,result);
    }
}
