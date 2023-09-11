package ua.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTests {
    private SumCalculator calculator;

    @BeforeEach
    public void beforeEach(){
        calculator = new SumCalculator();
    }

    @Test
    public void testSumFrom1To3(){
        int actual = calculator.sum(3);
        // 1 + 2 + 3 = 6
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSumFrom1To6(){
        int actual = calculator.sum(6);
        // 1 + 2 + 3 + 4 + 5 + 6 = 21
        int expected = 21;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSumFrom1To24(){
        int actual = calculator.sum(24);
        // 1 + 2 + 3 + 4 + ... + 24 = 300
        int expected = 300;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testZeroThrowIllegalArgumentException(){
        int actual = 0;
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> calculator.sum(actual)
        );
    }

    @Test
    public void testNegativeThrowIllegalArgumentException(){
        int actual = -4;
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> calculator.sum(actual)
        );
    }

}
