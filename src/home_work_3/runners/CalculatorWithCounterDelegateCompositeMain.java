package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterDelegateCompositeMain<result4> {

    CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();

    double a = 4.1;
    double b = 15;
    double c = 7;
    double d = 28;
    double e = 5;
    int f = 2;
    double result1 = b * c;
    double result2 = c / d;
    double result3 = a + result1;
    double result4 = result2 * f;

}
