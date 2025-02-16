package com.example;

import org.junit.platform.commons.annotation.Testable;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class CalculatorServiceTest {
    @Testable
    void testMockAddition() {
        Calculator mockCalculator = Mockito.mock(Calculator.class);
        when(mockCalculator.add(2, 3)).thenReturn(5);

        int result = mockCalculator.add(2, 3);
        assertEquals(5, result);

        verify(mockCalculator, times(1)).add(2, 3);
    }
}
