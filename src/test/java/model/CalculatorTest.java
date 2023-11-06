package model;

import exceptions.DividendIsZeroException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Check Addition")
    void add() {
        assertEquals(10, Calculator.add(5,5));
    }

    @Test
    @DisplayName("Check Subtraction")
    void subtract() {
        long seed = 6789L;
        Random random = new Random(seed);
        for (int i = 0; i < 100; i++) {
            float num1 = random.nextFloat(0,101);
            float num2 = random.nextFloat(0,101);
            float result = num1 - num2;
            assertEquals(result, Calculator.subtract(num1, num2));
        }
    }

    @Test
    @DisplayName("Check Division")
    void divide() {
        assertEquals(10, Calculator.divide(100,10));
    }

    @Test
    @DisplayName("Check Multiplication")
    void multiply() {
        assertEquals(10, Calculator.multiply(5,2));
    }

    @Test
    @DisplayName("throws DividendIsZero")
    void invalidDividend(){
        assertThrows(DividendIsZeroException.class, () -> {
            Calculator.divide(0,0);
        });
    }
}