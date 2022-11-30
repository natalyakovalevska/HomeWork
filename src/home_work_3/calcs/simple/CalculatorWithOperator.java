package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {


    @Override
    public double plus(double a, double b, double c) {
        return a + b + c;
    }

    @Override
    public double pow(double c, double d) {
        return 0;
    }

    public double pow(double d, double e, int f) {
        double result = d;
        for (long i = 1; i < d; i++) {
            result = result * d;
        }
        return result;
    }

    public double squareRoot(double a) {
        return Math.sqrt(a);
    }

    public double valueNumber(double value) {
        if (value < 0) {
            value = -value;
        }
        return value;
    }

    @Override
    public double division(double c) {
        return 0;
    }


    public double division(double d, double e) {
        return d / e;
    }
}