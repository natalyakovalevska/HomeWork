package home_work_2.loops;

import java.util.Scanner;

public class Task1_3 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число для воззведения в степень");
        Double base = console.nextDouble();
        long power = 0;
        do {
            System.out.println("Введите целое положительное число, которая будет определяться, как степень");
            power = console.nextLong();
        } while (power < 0);

        pow(base, power);

    }

    public static void pow(double base, long power) {
        double result = base;
        for (long i = 1; i < power; i++) {
            result = result * base;
        }
        System.out.println(base + " ^ " + power + " = " + result);
    }
}



