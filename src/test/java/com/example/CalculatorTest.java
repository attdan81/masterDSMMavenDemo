package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        int result=calculator.add(2, 3);
        assertEquals(5, result, "The result of 2 + 3 should be 5");
    }

    @Test
    void testDivideByZero() {
        Calculator calculator = new Calculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(6, 0);
        });
        assertEquals("Cannot divide by zero (0).", exception.getMessage());
    }
    
}
