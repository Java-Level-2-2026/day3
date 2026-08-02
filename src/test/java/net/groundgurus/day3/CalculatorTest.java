package net.groundgurus.day3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    @DisplayName("Add two numbers")
    void addTwoNumbers() {
        int sum = Calculator.add(10, 20);
        assertEquals(30, sum);
    }
}
