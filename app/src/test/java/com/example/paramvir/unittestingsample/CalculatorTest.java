package com.example.paramvir.unittestingsample;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        int x = calculator.addTwoValues(30, 40);
        Assert.assertEquals(70, x);
    }

    @Test
    public void testAdditionLargeValues(){

    }

    @Test
    public void testAdditionZero(){
        int x = calculator.addTwoValues(30, 0);
        Assert.assertEquals(30, x);
    }

    @Test
    public void testAdditionOfNegativeValues(){
        int a = 30;
        int b = -40;
        int result = calculator.addTwoValues(a, b);
        Assert.assertEquals(-10, result);
    }

    @Test
    public void testSubtraction(){
        int result = calculator.subtract(30, 40);
        Assert.assertEquals(-10, result);
    }

    @Test
    public void testMultiplication(){
        int result = calculator.multiply(30, 40);
        Assert.assertEquals(1200, result);
    }

}
