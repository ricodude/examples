package com.javacodegeeks.example;

import org.jboss.arquillian.container.test.api.ShouldThrowException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.regex.Matcher;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    StringCalculator calculator;

    @Before
    public void init() {
        calculator = new StringCalculator();
    }

    @Test
    public void testDefaultDelimiters() {
        String input = "10\n200,3";
        assertEquals(213, calculator.add(input));
    }

    @Test
    public void testMultiDelimiters() {
        String input = "//[**][%][&]\n100\n200,300**400%500&600";
        assertEquals(2100, calculator.add(input));
    }

    @Test
    public void testNumbersMoreThan1000() {
        String input = "1000,2000,3,4000,5,6000";
        assertEquals(8, calculator.add(input));
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testExceptionForNegativeNumbers() {
        // arrange
        thrown.expect(RuntimeException.class);
        thrown.expectMessage("[-1,-4] negative numbers not allowed.");
        // act
        String input = "-1,2,3,-4,5";
        calculator.add(input);
    }

}