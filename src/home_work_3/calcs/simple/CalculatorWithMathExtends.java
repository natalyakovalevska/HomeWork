package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public abstract class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    @Override
    public double plus(double a, double b, double c) {
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
    public double division(double d, double e) {
        return d / e;
    }
}
