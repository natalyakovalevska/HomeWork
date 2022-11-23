package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    @Override
    public double plus(double a, int b, double c) {
        return a + b + c;
    }

    @Override
    public double pow(double c, double d) {
        double result = c;
        for (long i = 1; i < d; i++) {
            result = result * c;
        }
        return result;
    }

    @Override
    public double squareRoot(double a) {
        return Math.sqrt(a);
    }

    @Override
    public double valueNumber(double value) {
        if (value < 0) {
            value = -value;
        }
        return value;
    }

    @Override
    public double division(double c) {
        return c;
    }

    @Override
    public double division(double c, double d) {
        return c / d;
    }
}
