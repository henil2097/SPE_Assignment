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
        int a = 15;
        int b = 25;
        long expectedResult = 40;
        long result = calculator.add(a,b);
        assertEquals(expectedResult,result);
    }
}
