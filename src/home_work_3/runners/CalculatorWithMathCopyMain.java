package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain<CCalculatorWithMathCopy> {
    CalculatorWithMathCopyMain calc = new CalculatorWithMathCopyMain();

    public double add(double a, double b, double c) {
        return a + b + c;
    }

    public double pow(double c, double d) {
        double result = c;
        for (long i = 1; i < d; i++) {
            result = result * c;
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

    public double division(double d, double e) {
        return d / e;
    }
}




}





