package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testStringReverse() {
        String reversed = org.apache.commons.lang3.StringUtils.reverse("Java");
        assertEquals("avaJ", reversed);
    }
}