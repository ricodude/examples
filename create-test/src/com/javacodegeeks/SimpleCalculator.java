package com.javacodegeeks;

public class SimpleCalculator {

    public double add(double n1, double n2) {
        return n1 + n2;
    }

    public double subtract(double n1, double n2) {
        return n1 - n2;
    }

    public double multiply(double n1, double n2) {
        return n1 * n2;
    }

    public double divide(double n1, double n2) {
        if ((int)n2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return n1 / n2;
    }
}
