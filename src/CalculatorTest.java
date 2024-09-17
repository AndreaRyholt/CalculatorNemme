package src;

import org.junit.Assert;
import org.junit.Test;

class CalculatorTest {

    double a = 1.0;
    double b = 2.0;

    Calculator calculator = new Calculator();

    @org.junit.jupiter.api.Test
    void testAddingNumbers() {
        double result = calculator.add(a, b);
        Assert.assertEquals(3.0, result, 0.1);
    }

   @Test
    void testSubtractingNumbers() {
        double result = calculator.subtract(a, b);
        Assert.assertEquals(-1.0, result, 0.1);
    }

    @Test
    void testMultiplyingNumbers() {
        double result = calculator.multiply(a, b);
        Assert.assertEquals(2.0, result, 0.1);
    }

    @Test
    void testDividingNumbers() {
        double result = calculator.divide(a, b);
        Assert.assertEquals(0.5, result, 0.1);
    }
}
