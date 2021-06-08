package md.tekwill.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void absoluteSum_whenTwoPlusTwo_returnsFour() {
        int absoluteSum = calculator.absoluteSum(2, 2);

        Assert.assertEquals(4, absoluteSum);
    }

    @Test
    public void absoluteSum_whenMinusTwoPlusTwo_returnsZero() {
        int absoluteSum = calculator.absoluteSum(-2, 2);

        Assert.assertEquals(0, absoluteSum);
    }

    @Test
    public void absoluteSum_whenMinusTwoAndAnotherMinusThree_returnsFive() {
        int absoluteSum = calculator.absoluteSum(-2, -3);

        Assert.assertEquals(5, absoluteSum);
    }

    @Test
    public void fraction_whenFourFractionTwo_returnsTwo() {
        double result = calculator.fraction(4, 2);

        Assert.assertEquals(2.0, result, 0.001);
    }

    @Test
    public void fraction_whenOneAndTwo_returnsZeroPointFive() {
        double result = calculator.fraction(1, 2);

        Assert.assertEquals(0.5, result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void fraction_whenDividendIsZero_throwsIllegalArgumentException() {
        calculator.fraction(0, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void fraction_whenDivisorIsZero_throwsIllegalArgumentException() {
        calculator.fraction(4, 0);
    }
}


