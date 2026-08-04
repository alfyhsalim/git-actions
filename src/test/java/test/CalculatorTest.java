package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void addReturnsSum() {
        assertEquals(7, calculator.add(3, 4));
    }

    @Test
    void classifyHandlesPositiveAndZero() {
        assertEquals("positive", calculator.classify(5));
        assertEquals("zero", calculator.classify(0));
    }
}
