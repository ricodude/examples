package com.javacodegeeks;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class SimpleCalculatorTest {

    private SimpleCalculator calculator;

    @Before
    public void setUp() {
        this.calculator = new SimpleCalculator();
    }

    @Test
    public void testAdd() {
        double n1 = 1.5;
        double n2 = 3.5;
        double actual = this.calculator.add(n1, n2);
        assertEquals(5.0, actual, 0.000);
    }

    @Test
    public void testSubtract() {
        double n1 = 6;
        double n2 = 1.5;
        double actual = this.calculator.subtract(n1, n2);
        assertEquals(4.5, actual, 0.000);
    }

    @Test
    public void testMultiply() {
        double n1 = 7;
        double n2 = 2;
        double actual = this.calculator.multiply(n1, n2);
        assertEquals(14, actual, 0.000);
    }

    @Test
    public void testDivide() {
        double n1 = 40;
        double n2 = 8;
        double actual = this.calculator.divide(n1, n2);
        assertEquals(5, actual, 0.000);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testExceptionForDivideByZero() {
        // arrange
        thrown.expect(RuntimeException.class);
        thrown.expectMessage("Cannot divide by zero");
        // act
        double n1 = 40;
        double n2 = 0;
        double actual = this.calculator.divide(n1, n2);
    }
}