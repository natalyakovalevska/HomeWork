package home_work_3.runners;

public class WithoutCalculatorMain {
    public static void main(String[] args) {
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
        //4.1 + (15 * 7) + (28 / 5) ^ 2 = 140.46
        System.out.println(4.1 + 15 * 7 + Math.pow(5.6, 2));
    }
}


