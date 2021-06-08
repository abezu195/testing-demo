package md.tekwill.calculator;

public class Calculator {

    public int absoluteSum(int a, int b) {
        int sum = a + b;
        return sum < 0 ? sum * (-1) : sum;
    }

    public double fraction(int dividend, int divisor) {
        if (dividend == 0 || divisor == 0) {
            throw new IllegalArgumentException();
        }
        return (double) dividend / divisor;
    }
}
