package com.example;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.platform.commons.annotation.Testable;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class CalculatorTestMockito {

    @Mock
    private Calculator calculator;

    @BeforeAll
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Testable
    public void testAdd() {
        when(calculator.add(2, 3)).thenReturn(5);

        int result = calculator.add(2, 3);

        assertEquals(5, result);
        verify(calculator).add(2, 3);
    }
}